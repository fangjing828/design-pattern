package design.pattern.struct.proxy.lazy;

import java.util.concurrent.TimeUnit;

public class MysqlDBQuery implements DBQuery {
    public MysqlDBQuery() {
        try {
            TimeUnit.SECONDS.sleep(1); // 模拟数据库连接耗时操作
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String request() {
        //TODO Auto-generated method stud.
        return "request String";
    }
}
