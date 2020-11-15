package code021;

public class Demo172Lambda {
    public static void main(String[] args) {

        //使用匿名内部类开启多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建新的线程");
            }
        }).start();

        //使用Lambda表达式开启多线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "创建新的线程");
        }).start();
    }
}
