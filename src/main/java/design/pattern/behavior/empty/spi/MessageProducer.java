package design.pattern.behavior.empty.spi;

public interface MessageProducer {
    void logError(Throwable cause);

    void logError(String message, Throwable cause);

    void logEvent(String type, String name);

    /**
     *
     * @param status "0" means success, otherwise means error code.
     * @param nameValuePairs name value pairs in the format of "a=c&b=2&..."
     */
    void logEvent(String type, String name, String status, String nameValuePairs);

    Transaction newTransaction(String type, String name);
}
