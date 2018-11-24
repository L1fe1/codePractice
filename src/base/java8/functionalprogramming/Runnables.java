package base.java8.functionalprogramming;

import java.util.UUID;

public class Runnables {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println(UUID.randomUUID());
        runnable.run();
    }
}
