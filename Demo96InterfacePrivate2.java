package code011;

public interface Demo96InterfacePrivate2 {
    public static void methodDefault1() {
        System.out.println("静态方法1");
        methodCommon();
    }

    public static void methodDefault2() {
        System.out.println("静态方法2");
        methodCommon();
    }

    private static void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
