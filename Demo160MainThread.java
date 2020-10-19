package code020;

public class Demo160MainThread {
    public static void main(String[] args) {

        Demo160Person p1 = new Demo160Person("yx");
        p1.run();

        //单线程会因为异常中断
        System.out.println(0 / 0);//ArithmeticException: / by zero

        Demo160Person p2 = new Demo160Person("YX");
        p2.run();
    }
}
