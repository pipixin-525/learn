package code020;

public class Demo161Thread {
    public static void main(String[] args) {

        //创建Thread类的子类对象
        Demo161MyThread mt = new Demo161MyThread();

        //调用Thread类中的方法，开启新的线程，执行run方法
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }
    }
}
