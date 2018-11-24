package base.java8.lambda;

import java.io.*;
import java.util.function.Predicate;

import org.junit.Test;

public class SerializablePredicateFilterTest {

    public String VALUE = "Bob";

    public interface SerializablePredicate<T> extends Predicate<T>, Serializable {}

    public <T> void filter(SerializablePredicate<T> sp, T value) throws IOException, ClassNotFoundException {
        sp.getClass().isLocalClass();
        File tempFile = File.createTempFile("labmda", "set");

        try (ObjectOutput oo = new ObjectOutputStream(new FileOutputStream(tempFile))) {
            oo.writeObject(sp);
        }

        try (ObjectInput oi = new ObjectInputStream(new FileInputStream(tempFile))) {
            SerializablePredicate<T> p = (SerializablePredicate<T>) oi.readObject();

            System.out.println(p.test(value));
        }
    }

    @Test(expected = NotSerializableException.class)
    public void testAnonymousDirect() throws IOException, ClassNotFoundException {

        String value = VALUE;

        filter(new SerializablePredicate<String>() {

            @Override
            public boolean test(String t) {
                return value.length() > t.length();
            }
        }, "Bob");

    }

    @Test(expected = NotSerializableException.class)
    public void testLocalClass() throws IOException, ClassNotFoundException {

        class LocalPredicate implements SerializablePredicate<String> {
            @Override
            public boolean test(String t) {
                // TODO Implement this method
                return false;
            }
        }

        filter(new LocalPredicate(), "Bobby");

    }

    public static class LengthPredicate implements SerializablePredicate<String> {

        private String value;

        public LengthPredicate(String value) {
            super();
            this.value = value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public boolean test(String t) {
            // TODO Implement this method
            return false;
        }
    }

    @Test
    public void testStaticInnerClass() throws IOException, ClassNotFoundException {

        filter(new LengthPredicate(VALUE), "Bobby");

    }

    @Test(expected = NotSerializableException.class)
    public void testLambdaDirect() throws IOException, ClassNotFoundException {

        String value = VALUE;

        filter((String s) -> value.length() > s.length(), "Bobby");

    }

    @Test
    public void testLambdaParameter() throws IOException, ClassNotFoundException {

        invokeWithParameter(VALUE);

    }

    private void invokeWithParameter(String value) throws java.lang.ClassNotFoundException, java.io.IOException {
        filter((String s) -> value.length() > s.length(), "Bobby");
    }

}
