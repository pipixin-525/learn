package code016;

public class Demo132GenericInterfaceImpl2<E> implements Demo132GenericInterface<E> {

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
