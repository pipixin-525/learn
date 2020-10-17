package code019;

public class Demo158ExtendsException {
    public static void method1() throws NullPointerException, ClassCastException {
    }

    public static void method2() throws IndexOutOfBoundsException {
    }

    public static void method3() throws IndexOutOfBoundsException {
    }

    public static void method4() {
    }
}

class zi extends Demo158ExtendsException {
    //子类重写父类方法时，抛出和父类相同的异常
    public static void method1() throws NullPointerException, ClassCastException {
    }

    //子类重写父类方法时，抛出父类异常的子类
    public static void method2() throws ArrayIndexOutOfBoundsException {
    }

    //子类重写父类方法时，不抛出异常
    public static void method3() {
    }

    //父类方法没有抛出异常，子类重写父类方法时也可不抛出异常
    //子类产生该异常只能捕获处理，不能声明抛出
    public static void method4() {
        try {
            throw new Exception("编译期异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
