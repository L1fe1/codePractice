package base.java8.lambda;

import base.java8.functionalprogramming.ConverterImpl;

public class LambdaRange {
    static int outerStaticNum;

    int outerNum;

    void testScopes() {
        int num = 1;

        ConverterImpl.Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);

        String convert = stringConverter.convert(2);
        System.out.println(convert);    // 3

//        num = 3; 编译错误！num在编译的时候被隐式地当做final变量来处理。

        ConverterImpl.Converter<Integer, String> stringConverter2 = (from) -> {
            outerNum = 13;
            return String.valueOf(from);
        };

        ConverterImpl.Converter<Integer, String> stringConverter3 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };

        String[] array = new String[1];
        ConverterImpl.Converter<Integer, String> stringConverter4 = (from) -> {
            array[0] = "Hi there";
            return String.valueOf(from);
        };

        stringConverter4.convert(23);

        System.out.println(array[0]);
    }

    public static void main(String[] args) {
        new LambdaRange().testScopes();
    }
}
