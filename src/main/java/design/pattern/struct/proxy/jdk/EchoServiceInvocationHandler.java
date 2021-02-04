package design.pattern.struct.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class EchoServiceInvocationHandler implements InvocationHandler {
    private final EchoService target;

    public EchoServiceInvocationHandler(EchoService target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before execute.");
        Object res = method.invoke(target, args);
        System.out.println("After execute");
        return res;
    }

    public static void main(String[] args) {
        EchoService service = new EchoServiceImpl();
        EchoService proxy = (EchoService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                service.getClass().getInterfaces(), new EchoServiceInvocationHandler(service));

        System.out.println(service.getClass());
        System.out.println(proxy.getClass());

        proxy.echo("Hello World.");
    }
}
