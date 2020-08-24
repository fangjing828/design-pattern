package pers.fj.design_pattern.behavior.empty.internal.cat;

import pers.fj.design_pattern.behavior.empty.spi.Transaction;

import java.lang.reflect.Method;

public class CatTransaction implements Transaction {
    private static Class CAT_TRANSACTION_CLASS;
    private static Method SET_STATUS_WITH_STATUS;
    private static Method SET_STATUS_WITH_THROWABLE;
    private static Method ADD_DATA_WITH_KEY_VALUE;
    private static Method COMPLETE;

    static {
        try {
            CAT_TRANSACTION_CLASS = Class.forName(CatNames.CAT_TRANSACTION_CLASS);
            SET_STATUS_WITH_STATUS = CAT_TRANSACTION_CLASS.getMethod(CatNames.SET_STATUS_METHOD, String.class);
            SET_STATUS_WITH_THROWABLE = CAT_TRANSACTION_CLASS.getDeclaredMethod(CatNames.SET_STATUS_METHOD,
                    Throwable.class);
            ADD_DATA_WITH_KEY_VALUE = CAT_TRANSACTION_CLASS.getMethod(CatNames.ADD_DATA_METHOD, String.class, String.class);
            COMPLETE = CAT_TRANSACTION_CLASS.getMethod(CatNames.COMPLETE_METHOD);
        } catch (Throwable ex) {
            throw new IllegalStateException(ex);
        }
    }

    private Object catTransaction;

    public CatTransaction(Object catTransaction) {
        this.catTransaction = catTransaction;
    }

    @Override
    public void setStatus(String status) {
        try {
            SET_STATUS_WITH_STATUS.invoke(catTransaction, status);
        } catch (Throwable ex) {
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public void setStatus(Throwable e) {
        try {
            SET_STATUS_WITH_THROWABLE.invoke(catTransaction, e);
        } catch (Throwable ex) {
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public void addData(String key, Object value) {
        try {
            ADD_DATA_WITH_KEY_VALUE.invoke(catTransaction, key, value);
        } catch (Throwable ex) {
            throw new IllegalStateException(ex);
        }
    }

    @Override
    public void complete() {
        try {
            COMPLETE.invoke(catTransaction);
        } catch (Throwable ex) {
            throw new IllegalStateException(ex);
        }
    }
}
