package code016;

public class Demo131GenericMethodClass {
    public static void main(String[] args) {
        Demo131GenericMethod gen = new Demo131GenericMethod();
        gen.method1("yx");
        gen.method1(1);
        gen.method1(1.1);
        gen.method1(true);

        System.out.println("==========");

        Demo131GenericMethod.method2("静态方法");
        Demo131GenericMethod.method2(1);
        Demo131GenericMethod.method2(1.1);
        Demo131GenericMethod.method2(true);
    }
}
