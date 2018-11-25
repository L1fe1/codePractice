package base.java8.annotations;

import java.lang.annotation.*;

public class Annotations {
    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @interface MyAnnotation {

    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface Hints {
        Hint[] value();
    }

    @Repeatable(Hints.class)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Hint {
        String value();
    }

    /**
     * 使用注解容器（老方法）
     */
//    @Hints({@Hint("hint1"), @Hint("hint2")})
//    class Person {}

    /**
     * 使用可重复注解（新方法）
     */
    @Hint("hint1")
    @Hint("hint2")
    class Person {

    }

    public static void main(String[] args) {
        Hint hint = Person.class.getAnnotation(Hint.class);
        System.out.println(hint);   // null

        Hints hints1 = Person.class.getAnnotation(Hints.class);
        System.out.println(hints1.value().length);  // 2

        Hint[] hints2 = Person.class.getAnnotationsByType(Hint.class);
        System.out.println(hints2.length);  // 2

    }
}
