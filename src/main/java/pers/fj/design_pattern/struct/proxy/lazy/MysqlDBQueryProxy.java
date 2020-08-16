package pers.fj.design_pattern.struct.proxy.lazy;

public class MysqlDBQueryProxy implements DBQuery {
    private volatile DBQuery real;

    @Override
    public String request() {
        return getReal().request();
    }

    private DBQuery getReal() {
        if (real == null) {
            synchronized (MysqlDBQueryProxy.class) {
                if (real == null) {
                    real = new MysqlDBQuery();
                }
            }
        }
        return real;
    }

    public static void main(String[] args) {
        DBQuery q = new MysqlDBQueryProxy();
        System.out.println(q.request()); //在真正使用的时候才创建真实对象
    }
}
