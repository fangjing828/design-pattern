package design.pattern.struct.proxy.jdk;

public class EchoServiceImpl implements EchoService {
    public String echo(String message) {
        System.out.println("Execute EchoServiceImpl#echo");
        return message;
    }
}
