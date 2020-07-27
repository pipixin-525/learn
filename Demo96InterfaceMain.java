package code011;

public class Demo96InterfaceMain {
    public static void main(String[] args) {
        Demo96InterfacePrivate2.methodDefault1();
        System.out.println("==========");
        Demo96InterfacePrivate2.methodDefault2();
        System.out.println("==========");

        Demo96Interface a = new Demo96Interface();
        a.methodDefault1();
        System.out.println("==========");
        a.methodDefault2();
    }
}
