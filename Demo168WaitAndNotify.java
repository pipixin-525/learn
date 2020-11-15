package code021;

public class Demo168WaitAndNotify {
    public static void main(String[] args) {

        //创建锁对象，保证锁唯一
        Object obj = new Object();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("老板，来3个包子");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("开吃");
                        System.out.println("==========");
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("包子做好了");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
