package base.java8.functionalprogramming;

import java.util.UUID;
import java.util.concurrent.Callable;

public class Callables {
    public static void main(String[] args) {
        Callable<UUID> callable = UUID::randomUUID;
        try {
            callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
