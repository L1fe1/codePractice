package base.java8.defaultmethods;

interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }

    static int positive(int a) {
        return a > 0 ? a : 0;
    }
}

public class FormulaImpl {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        formula.calculate(100);     // 100.0
        formula.sqrt(16);           // 4.0
        Formula.positive(-4);       // 0.0

        // Formula formula1 = (a) -> sqrt( a * 100); 编译错误！默认方法无法在lambda表达式内部被访问。
    }
}
