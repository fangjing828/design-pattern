package design.pattern.behavior.empty.internal;

import design.pattern.behavior.empty.spi.Transaction;

public class NullTransaction implements Transaction {
    @Override
    public void setStatus(String status) {

    }

    @Override
    public void setStatus(Throwable e) {

    }

    @Override
    public void addData(String key, Object value) {

    }

    @Override
    public void complete() {

    }
}
