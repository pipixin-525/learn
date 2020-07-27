package code011;

public interface Demo95InterfaceDefault {

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }

    public static void methodStatic() {
        System.out.println("这是接口的静态方法");
    }

}
