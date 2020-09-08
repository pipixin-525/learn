package code015;

import java.util.Calendar;
import java.util.Date;

public class Demo111Calendar {

    public static void main(String[] args) {
        get();
        System.out.println("=====");
        set();
        System.out.println("=====");
        add();
        System.out.println("=====");
        getTime();
    }

    public static void get() {
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        System.out.println(year + "年");

        int month = c.get(Calendar.MONTH);
        // 西方0-11；东方1-12
        System.out.println(month + "月");

        //int date = c.get(Calendar.DAY_OF_MONTH);
        // System.out.println(date);
        int date = c.get(Calendar.DATE);
        System.out.println(date + "日");
    }

    public static void set() {
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR, 2077);
        int year = c.get(Calendar.YEAR);
        System.out.println(year + "年");

        c.set(Calendar.MONTH, 7);
        int month = c.get(Calendar.MONTH);
        System.out.println(month + "月");

        c.set(Calendar.DATE, 27);
        int date = c.get(Calendar.DATE);
        System.out.println(date + "日");
    }

    public static void add() {
        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR, 20);
        int year = c.get(Calendar.YEAR);
        System.out.println(year + "年");

        c.add(Calendar.MONTH, -2);
        int month = c.get(Calendar.MONTH);
        System.out.println(month + "月");

        c.add(Calendar.DATE, 5);
        int date = c.get(Calendar.DATE);
        System.out.println(date + "日");
    }

    public static void getTime() {
        Calendar c = Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);
    }
}
