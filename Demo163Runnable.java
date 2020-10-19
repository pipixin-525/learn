package code020;

public class Demo163Runnable {
    public static void main(String[] args) {

        //创建一个Runnable接口的实现类对象
        Demo163RunnableImpl run = new Demo163RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t = new Thread(run);
        //调用Thread类中的start方法，开启新的线程执行run方法
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
