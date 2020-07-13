package code008;

import java.util.ArrayList;

public class Demo68ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean success = list.add("A");
        System.out.println(list);
        System.out.println("添加操作是否成功：" + success);

        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        //从集合中获取元素：get 从索引值0开始
        String name = list.get(2);
        System.out.println("第2号索引值的位置：" + name);

        //从集合中删除元素：remove 索引值从0开始
        String whoRemoved = list.remove(3);
        System.out.println("被删除的元素是：" + whoRemoved);
        System.out.println(list);

        //获取集合的长度尺寸，也就是其中元素的个数
        int size = list.size();
        System.out.println("集合的长度是：" + size);
    }
}
