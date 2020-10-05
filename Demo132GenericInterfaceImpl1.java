package code016;

public class Demo132GenericInterfaceImpl1 implements Demo132GenericInterface<String> {

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
