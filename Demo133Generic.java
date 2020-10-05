package code016;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo133Generic {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("a");
        array2.add("b");
        array2.add("c");

        method(array1);
        System.out.println("=====");
        method(array2);
    }

    //定义一个方法遍历所有类型的集合
    public static void method(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }

    }
}
