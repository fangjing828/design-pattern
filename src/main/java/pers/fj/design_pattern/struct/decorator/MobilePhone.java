package pers.fj.design_pattern.struct.decorator;

public class MobilePhone implements Phone {
    private final Phone phone;

    public MobilePhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        phone.call();
    }

    public void sendMessge(String message) {
        System.out.println("Send message:" + message);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone(new Telephone());
        phone.call();
        phone.sendMessge("Hello World!");
    }
}
