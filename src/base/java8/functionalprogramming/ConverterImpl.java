package base.java8.functionalprogramming;


public class ConverterImpl {
    @FunctionalInterface
    public static interface Converter<F, T> {
        T convert(F from);
    }
    static class Something {
        String startsWith(String s) {
            return String.valueOf(s.charAt(0));
        }
    }
    public static void main(String[] args) {
        Converter<String, Integer> stringIntegerConverter = Integer::valueOf;
        Integer integerConverted = stringIntegerConverter.convert("123");
        System.out.println(integerConverted);    // 123

        Something something = new Something();
        Converter<String, String> stringStringConverter = something::startsWith;
        String stringConverted = stringStringConverter.convert("Java");
        System.out.println(stringConverted);    // "J"
    }
}
