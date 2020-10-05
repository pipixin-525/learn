package code016;

public class Demo132GenericInterfaceMain {
    public static void main(String[] args) {

        Demo132GenericInterfaceImpl1 impl1 = new Demo132GenericInterfaceImpl1();
        impl1.method("yx");


        Demo132GenericInterfaceImpl2<Integer> impl2 = new Demo132GenericInterfaceImpl2<>();
        impl2.method(1);

        Demo132GenericInterfaceImpl2<Double> impl3 = new Demo132GenericInterfaceImpl2<>();
        impl3.method(1.1);
    }
}
