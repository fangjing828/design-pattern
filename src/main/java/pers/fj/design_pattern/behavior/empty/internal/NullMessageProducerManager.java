package pers.fj.design_pattern.behavior.empty.internal;

import pers.fj.design_pattern.behavior.empty.spi.MessageProducer;
import pers.fj.design_pattern.behavior.empty.spi.MessageProducerManager;

public class NullMessageProducerManager implements MessageProducerManager {
    private static final MessageProducer producer = new NullMessageProducer();

    @Override
    public MessageProducer getProducer() {
        return producer;
    }
}
