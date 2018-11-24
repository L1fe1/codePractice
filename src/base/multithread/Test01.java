package base.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 还可以使用Semaphore或CountdownLatch来实现同步。
 */
public class Test01 {
    public static void main(String[] args) {
        Account account = new Account();
        ExecutorService service = Executors.newFixedThreadPool(100);

        for(int i = 1; i <= 100; i++) {
            service.execute(new AddMoneyThread(account, 1));
        }

        service.shutdown();

        while(!service.isTerminated()) {}

        /**
         * 在没有同步的情况下，执行结果通常是显示账户余额在10元以下，
         * 出现这种状况的原因是，当一个线程A试图存入1元的时候，另外一个线程B也能够进入存款的方法中，
         * 线程B读取到的账户余额仍然是线程A存入1元钱之前的账户余额，因此也是在原来的余额0上面做了加1元的操作，
         * 同理线程C也会做类似的事情，所以最后100个线程执行结束时，
         * 本来期望账户余额为100元，但实际得到的通常在10元以下（很可能是1元哦）。
         * 解决这个问题的办法就是同步，当一个线程对银行账户存钱时，需要将此账户锁定，待其操作完成后才允许其他的线程进行操作。
         */
        System.out.println("账户余额: " + account.getBalance());
    }
}
