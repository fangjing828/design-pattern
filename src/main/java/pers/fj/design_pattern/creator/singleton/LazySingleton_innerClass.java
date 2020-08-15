package pers.fj.design_pattern.creator.singleton;

public class LazySingleton_innerClass {
    private static class SingletHolder {
        private static final LazySingleton_innerClass instance =
                new LazySingleton_innerClass();
    }

    private LazySingleton_innerClass() {

    }

    public static final LazySingleton_innerClass getInstance() {
        return SingletHolder.instance;
    }
}
