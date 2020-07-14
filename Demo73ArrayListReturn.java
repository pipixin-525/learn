package code008;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中偶数元素，放到小集合当中。
要求使用自定义的方法来实现筛选。
 */
public class Demo73ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            list1.add(num);
        }
        System.out.println(list1);

        ArrayList<Integer> list3 = list2(list1);
        System.out.println(list3);
        System.out.println("偶数一共有：" + list3.size() + "个");
    }

    public static ArrayList<Integer> list2(ArrayList<Integer> list1) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            int num2 = list1.get(i);
            if (num2 % 2 == 0) {
                list2.add(num2);
            }
        }
        return list2;
    }
}
