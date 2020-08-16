package pers.fj.design_pattern.struct.proxy.cglib;

public class EchoServiceImpl implements EchoService {
    public String echo(String message) {
        System.out.println("Execute EchoServiceImpl#echo");
        return message;
    }
}
