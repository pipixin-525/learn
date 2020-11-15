package code020;

import java.util.concurrent.locks.ReentrantLock;

public class Demo168RunnableLock implements Runnable {
    //定义一个多线程的共享票源
    private int ticket = 100;

    //创建一个锁对象
    Object obj = new Object();

    //在成员变量位置处创建ReentrantLock的对象
    ReentrantLock lock = new ReentrantLock();

    //设置线程任务：买票
    @Override
    public void run() {
        //设置死循环，让买票操作重复执行
        while (true) {
            //获取锁
            lock.lock();
            //先判断票是否存在
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "正在卖第--->" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //释放锁
                    lock.unlock();
                }
            }
        }
    }
}
