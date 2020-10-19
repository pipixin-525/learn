package code020;

public class Demo162GetThreadName {
    public static void main(String[] args) {

        Demo162MyThread mt = new Demo162MyThread();
        mt.setName("yx");
        mt.start();

        new Demo162MyThread().start();
        new Demo162MyThread().start();
        new Demo162MyThread().start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
