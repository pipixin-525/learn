package code020;

public class Demo168RunnableLockImpl {
    public static void main(String[] args) {
        Demo168RunnableLock runnableLock = new Demo168RunnableLock();

        Thread th1 = new Thread(runnableLock);
        Thread th2 = new Thread(runnableLock);
        Thread th3 = new Thread(runnableLock);

        th1.setName("窗口1");
        th2.setName("窗口2");
        th3.setName("窗口3");

        th1.start();
        th2.start();
        th3.start();
    }
}
