package base.innerclass;

public class OuterClass {
    class InnerClass {
        // static int x; not allowed here
    }

    static class StaticInnerClass {
        static int x; // allowed here
    }
}

class ICTest {
    public static void main(String... str) {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass obj1 = oc.new InnerClass();// need of inclosing
        // instance
        OuterClass.StaticInnerClass obj2 = new OuterClass.StaticInnerClass();
        // no need of reference of object of outer class
    }
}
