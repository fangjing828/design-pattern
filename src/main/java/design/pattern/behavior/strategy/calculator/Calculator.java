package design.pattern.behavior.strategy.calculator;

public class Calculator {
    private static final String SYMBOL_ADD = "+";
    private static final String SYMBOL_SUB = "-";

    public int calc(int a, int b, final String symbol) {
        if (SYMBOL_ADD.equalsIgnoreCase(symbol)) {
            return a + b;
        } else if (SYMBOL_SUB.equalsIgnoreCase(symbol)) {
            return a - b;
        }
        return 0;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calc(9,8, "-"));
    }
}
