package code015;

import java.util.ArrayList;

public class Demo125Integer {
    public static void main(String[] args) {

        //自动装箱
        Integer n1 = 1;

        //自动拆箱
        n1 += 1;
        System.out.println(n1);

        ArrayList<Integer> list = new ArrayList();
        //自动装箱
        list.add(1);
        //自动拆箱
        Integer n2 = list.get(0);
        System.out.println(n2);

    }
}
