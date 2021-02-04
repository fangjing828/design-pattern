package design.pattern.struct.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class EchoServiceLib implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Before execute.");
        Object res = proxy.invokeSuper(o, args);
        System.out.println("After execute");
        return res;
    }

    //创建代理对象
    public Object getInstance(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public static void main(String[] args) {
        EchoServiceLib cglib = new EchoServiceLib();
        EchoServiceImpl serviceGglib = (EchoServiceImpl) cglib.getInstance(new EchoServiceImpl());
        serviceGglib.echo("Hello World");
    }
}
