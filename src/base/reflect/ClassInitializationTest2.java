package base.reflect;

/**
 * Another Java program example to demonstrate class initialization and loading in Java.
 */
public class ClassInitializationTest2 {
    public static void main(String args[]) throws InterruptedException {

        //accessing static field of Parent through child, should only initialize Parent
        System.out.println(Child2.familyName);
    }
}
class Child2 extends Parent2{
    static { System.out.println("static block of Sub class is initialized in Java "); }
    {System.out.println("non static blocks in sub class is initialized");}
}
class Parent2 {
    //compile time constant, accessing this will not trigger class initialization
    //protected static final String familyName = "Lawson";

    protected static String familyName = "Lawson";

    static { System.out.println("static block of Super class is initialized"); }
    {System.out.println("non static blocks in super class is initialized");}
}
