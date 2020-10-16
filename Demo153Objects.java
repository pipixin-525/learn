package code019;

import java.util.Objects;

public class Demo153Objects {
    public static void main(String[] args) {
        //method1(null);
        method2(null);

    }

    public static void method1(Object obj) {
        if (obj == null) {
            throw new NullPointerException("传递的对象值是null");
        }
    }

    public static void method2(Object obj) {
        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "传递的对象值是null");
    }
}
