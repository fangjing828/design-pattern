package pers.fj.design_pattern.behavior.empty.internal;

import pers.fj.design_pattern.behavior.empty.spi.MessageProducer;
import pers.fj.design_pattern.behavior.empty.spi.MessageProducerManager;

public class DefaultMessageProducerManager implements MessageProducerManager {
    @Override
    public MessageProducer getProducer() {
        return null;
    }
}
