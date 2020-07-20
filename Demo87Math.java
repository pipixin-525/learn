package code009;

public class Demo87Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(2.5));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("==========");

        //向上取整
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.ceil(2.9));
        System.out.println(Math.ceil(2.0));
        System.out.println("==========");

        //向下取整
        System.out.println(Math.floor(5.9));
        System.out.println(Math.floor(5.1));
        System.out.println(Math.floor(5.0));
        System.out.println("==========");

        //四舍五入
        System.out.println(Math.round(8.0));
        System.out.println(Math.round(8.4));
        System.out.println(Math.round(8.5));
        System.out.println(Math.round(8.9));
        System.out.println("==========");

        //Π
        System.out.println(Math.PI);

    }
}
