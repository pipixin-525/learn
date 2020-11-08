package code020;

public class Demo164InnerClassThread {
    public static void main(String[] args) {

        new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "----->" + "1");
                }
            }
        }.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "----->" + "2");
                }
            }
        };

        new Thread(runnable).start();
    }
}
