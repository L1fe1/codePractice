package base.equal;

public class Test {
    public static void main(String[] args) {
        String s = " Hello ";
        s += " World "; //由于指向了新的对象，原来的对象变成了不可达对象
        s.trim( ); //创建了一个不可达对象
        System.out.println(s);
        StringBuilder sb = new StringBuilder(" Hello ");
        sb.append(" World ");
        System.out.println(sb.toString().trim( ));
        Object s1 = new String("Hello");
        Object s2 = new String("Hello");

        if(s1 == s2) {
            System.out.println("s1 and s2 are ==");
        }
        if (s1.equals(s2)) {
            System.out.println("s1 and s2 are equals()");
        }
        /**
         * 这个例子（或者说，规则）比较特殊，是一个典型的flyweight 模式在字符串对象创建中的应用。
         * 这个模式通过减少对象的创建来节约内存。
         * String对象会创建一个字符串池（a pool of string），如果当前准备新创建的字符串对象的值在这个池子中已经存在，那么就不会生成新对象，而是复用池中已有的字符串对象。
         * flyweight 模式的精髓就是对象复用。不过，只有采用Object s = “Hello”方式（而非用”new“关键字）声明String对象的时候这个规则才会被应用。
         */
        Object s3 = "Hello";
        Object s4 = "Hello";

        if (s3 == s4) {
            System.out.println("s3 and s4 are ==");
        }
        if (s3.equals(s4)) {
            System.out.println("s3 and s4 are equals()");
        }
    }
}
