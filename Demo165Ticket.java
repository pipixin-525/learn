package code020;

public class Demo165Ticket {
    public static void main(String[] args) {

        Demo165RunableImpl run = new Demo165RunableImpl();
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        Thread thread3 = new Thread(run);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
