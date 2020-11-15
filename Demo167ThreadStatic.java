package code020;

public class Demo167ThreadStatic implements Runnable{
    //定义一个多线程的共享票源
    private static int ticket = 100;

    //创建一个锁对象
    Object obj = new Object();

    //设置线程任务：买票
    @Override
    public void run() {
        //设置死循环，让买票操作重复执行
        while (true) {
            //创建同步代码块
            sale();
        }
    }

    public static synchronized void sale() {
//        synchronized (Demo167ThreadStatic.class) {
        //先判断票是否存在
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第--->" + ticket + "张票");
            ticket--;
        }
//        }
    }
}
