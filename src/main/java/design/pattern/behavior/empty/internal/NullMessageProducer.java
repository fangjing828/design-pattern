package design.pattern.behavior.empty.internal;

import design.pattern.behavior.empty.spi.MessageProducer;
import design.pattern.behavior.empty.spi.Transaction;

public class NullMessageProducer implements MessageProducer {
    @Override
    public void logError(Throwable cause) {

    }

    @Override
    public void logError(String message, Throwable cause) {

    }

    @Override
    public void logEvent(String type, String name) {

    }

    @Override
    public void logEvent(String type, String name, String status, String nameValuePairs) {

    }

    @Override
    public Transaction newTransaction(String type, String name) {
        return null;
    }
}
