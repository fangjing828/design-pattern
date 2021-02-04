package design.pattern.creator.singleton;

public class LazySingleton_dbCheck {
    // Set volatile to avoid reordering.
    private static volatile LazySingleton_dbCheck instance;

    public static LazySingleton_dbCheck getInstance() {
        if (instance == null) {
            synchronized (LazySingleton_dbCheck.class) {
                if (instance == null) {
                    instance = new LazySingleton_dbCheck();
                }
            }
        }
        return instance;
    }

    private LazySingleton_dbCheck() {

    }
}
