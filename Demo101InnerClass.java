package code013;

public class Demo101InnerClass {

    public static void main(String[] args) {
        Demo101Outer.Inner method = new Demo101Outer().new Inner();
        method.methodInner();

    }
}
