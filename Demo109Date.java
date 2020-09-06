package code015;

import java.util.Date;

public class Demo109Date {

    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

        System.out.println(System.currentTimeMillis());
        System.out.println("==========");

        date2();
        System.out.println("==========");

        date3();
    }

    public static void date2() {
        Date date = new Date(0L);
        System.out.println(date);
    }

    public static void date3() {
        Date date = new Date();
        System.out.println(date);
    }
}
