package code021;

public class Demo170BaoZiText {
    public static void main(String[] args) {
        BaoZi baozi = new BaoZi();
        //要使用一个包子对象作为锁对象
        Sale sale = new Sale(baozi);
        Buy buy = new Buy(baozi);

        Thread th1 = new Thread(sale, "店铺老板：");
        Thread th2 = new Thread(buy, "顾客：");

        th1.start();
        th2.start();
    }
}

class BaoZi {
    boolean have = false;
}

class Sale implements Runnable {
    final BaoZi baoZi;

    public Sale(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                if (baoZi.have) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "包子做好了");
                    baoZi.have = true;
                    baoZi.notify();
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class Buy implements Runnable {
    final BaoZi baoZi;

    public Buy(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                if (baoZi.have) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "吃掉包子");
                    baoZi.have = false;
                    try {
                        baoZi.notify();
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}