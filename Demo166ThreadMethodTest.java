package code020;

public class Demo166ThreadMethodTest {
    public static void main(String[] args) {
        Demo166ThreadMethod dtm = new Demo166ThreadMethod();

        Thread th1 = new Thread(dtm);
        Thread th2 = new Thread(dtm);
        Thread th3 = new Thread(dtm);

        th1.setName("窗口1");
        th2.setName("窗口2");
        th3.setName("窗口3");

        th1.start();
        th2.start();
        th3.start();
    }
}
