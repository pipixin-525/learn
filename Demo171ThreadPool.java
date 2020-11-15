package code021;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo171ThreadPool {
    public static void main(String[] args) {
        //创建一个指定数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(3);
        //传递线程任务（实现类），开启线程
        for (int i = 0; i < 10; i++) {
            es.submit(new Runn());
        }
        //不建议使用
        es.shutdown();
    }
}

class Runn implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新的线程任务");
    }
}