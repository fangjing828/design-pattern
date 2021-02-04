package design.pattern.behavior.empty.internal;

import design.pattern.behavior.empty.spi.MessageProducer;
import design.pattern.behavior.empty.spi.MessageProducerManager;

public class NullMessageProducerManager implements MessageProducerManager {
    private static final MessageProducer producer = new NullMessageProducer();

    @Override
    public MessageProducer getProducer() {
        return producer;
    }
}
