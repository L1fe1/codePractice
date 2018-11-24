package base.multithread;

/**
 * 存钱线程
 */
public class AddMoneyThread implements Runnable{
    private Account account;    // 存入账户
    private double money;       // 存入金额

    public AddMoneyThread(Account account, double money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        // 在线程调用存款方法时对银行账户进行同步
        synchronized (account) {
            account.deposit(money);
        }
    }
}
