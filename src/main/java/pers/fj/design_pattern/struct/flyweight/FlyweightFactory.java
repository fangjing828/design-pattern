package pers.fj.design_pattern.struct.flyweight;

import java.util.concurrent.ConcurrentHashMap;

public class FlyweightFactory {
    private static final ConcurrentHashMap<String, Flyweight> pool = new ConcurrentHashMap<>();

    public static Flyweight getFlyweight(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            synchronized (FlyweightFactory.class) {
                if (!pool.containsKey(intrinsicState)) {
                    pool.put(intrinsicState, new ConcreteFlyweight(intrinsicState));
                }
            }
        }
        return pool.get(intrinsicState);
    }

    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("aa");
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("bb");
        flyweight1.operation("a");
        flyweight2.operation("b");
    }

}
