package code015;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo110DateFormat {

    public static void main(String[] args) throws ParseException {
        date1();
        date2();
    }

    public static void date1() {

        SimpleDateFormat sim = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String s = sim.format(date);
        System.out.println(date);
        System.out.println(s);
        System.out.println("==========");
    }

    public static void date2() throws ParseException {
        SimpleDateFormat sim = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sim.parse("2020年09月06日 10时15分14秒");
        System.out.println(date);
    }
}
