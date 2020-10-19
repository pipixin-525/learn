package code020;

public class Demo162MyThread extends Thread {

    @Override
    public void run() {
        //String name = getName();
        //System.out.println(name);

        Thread t = Thread.currentThread();
        System.out.println(t);

        String name = t.getName();
        System.out.println(name);
    }
}
