package design.pattern.behavior.strategy;

public class ConcreateStrategyA implements Strategy{
    @Override
    public void algorithm() {
        System.out.println("StrategyA");
    }
}
