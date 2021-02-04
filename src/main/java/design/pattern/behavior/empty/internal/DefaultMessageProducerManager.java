package design.pattern.behavior.empty.internal;

import design.pattern.behavior.empty.spi.MessageProducer;
import design.pattern.behavior.empty.spi.MessageProducerManager;

public class DefaultMessageProducerManager implements MessageProducerManager {
    @Override
    public MessageProducer getProducer() {
        return null;
    }
}
