package base.enumeration;

interface food {
    void eat();
}

interface sport {
    void run();
}

public enum EnumDemo2 implements food, sport {
    FOOD,
    SPORT,
    ; //分号分隔

    @Override
    public void eat() {
        System.out.println("eat.....");
    }

    @Override
    public void run() {
        System.out.println("run.....");
    }
}
