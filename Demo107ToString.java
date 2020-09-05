package code015;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo107ToString {

    public static void main(String[] args) {

        //重写了toString方法
        Demo107Person p = new Demo107Person("yx", 22);
        String s = p.toString();
        System.out.println(p);
        System.out.println(s);
        System.out.println("====================");

        //没有重写了toString方法
        Random r = new Random(10);
        System.out.println(r);
        System.out.println("====================");

        //重写了toString方法
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        System.out.println("====================");

        //重写了toString方法
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

    }
}
