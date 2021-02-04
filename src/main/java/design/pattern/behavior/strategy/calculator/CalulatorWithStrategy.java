package design.pattern.behavior.strategy.calculator;

public class CalulatorWithStrategy {
    interface ICalculator {
        int calc(int a, int b);
    }

    static class Add implements ICalculator {
        @Override
        public int calc(int a, int b) {
            return a + b;
        }
    }

    static class Sub implements ICalculator {
        @Override
        public int calc(int a, int b) {
            return a - b;
        }
    }

    static class Multi implements ICalculator {
        @Override
        public int calc(int a, int b) {
            return a * b;
        }
    }

    static class Divide implements ICalculator {
        @Override
        public int calc(int a, int b) {
            return a / b;
        }
    }

    static class  Context {
        private ICalculator calculator;

        public Context(ICalculator calculator) {
            this.calculator = calculator;
        }

        public int calc(int a, int b) {
            return this.calculator.calc(a, b);
        }
    }

    public static void main(String[] args) {
        ICalculator calculator = new Divide();
        Context context = new Context(calculator);
        System.out.println(context.calc(9, 2));
    }
}
