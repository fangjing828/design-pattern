package pers.fj.design_pattern.behavior.empty.internal;

import pers.fj.design_pattern.behavior.empty.spi.MessageProducer;
import pers.fj.design_pattern.behavior.empty.spi.Transaction;

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
