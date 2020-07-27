package code011;

public class Demo95InterfaceDefaultMain {

    public static void main(String[] args) {
        Demo95InterfaceDefaultA a = new Demo95InterfaceDefaultA();
        a.methodAbs();
        a.methodDefault();
        System.out.println("==========");

        Demo95InterfaceDefaultB b = new Demo95InterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
        System.out.println("==========");

        Demo95InterfaceDefault.methodStatic();
    }
}
