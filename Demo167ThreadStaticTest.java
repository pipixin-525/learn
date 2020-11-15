package code020;

public class Demo167ThreadStaticTest {
    public static void main(String[] args) {
        Demo167ThreadStatic ts = new Demo167ThreadStatic();

        Thread th1 = new Thread(ts);
        Thread th2 = new Thread(ts);
        Thread th3 = new Thread(ts);

        th1.setName("窗口1");
        th2.setName("窗口2");
        th3.setName("窗口3");

        th1.start();
        th2.start();
        th3.start();
    }
}
