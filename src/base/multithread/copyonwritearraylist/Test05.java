package base.multithread.copyonwritearraylist;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test05 {
    private static final int THREAD_POOL_SIZE = 2;

    public static void main(String[] args) {
//        List<Double> list = new ArrayList<>(); // 产生ArrayIndexOutOfBoundsException
        List<Double> list = new CopyOnWriteArrayList<>();
        ExecutorService es = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        es.execute(new AddThread(list));
        es.execute(new AddThread(list));
        es.shutdown();
    }
}
