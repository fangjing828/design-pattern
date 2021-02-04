package design.pattern.behavior.strategy.calculator;

public class CalculatorWithStrategyAndEnum {
    enum Calculator {
        ADD("+"){
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        },
        SUB("-"){
            @Override
            public int calc(int a, int b) {
                return a - b;
            }
        };

        private String symbol;

        Calculator(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }

        public abstract int calc(int a, int b);
    }


    public static void main(String[] args) {
        System.out.println(Calculator.ADD.calc(1, 2));
    }

}
