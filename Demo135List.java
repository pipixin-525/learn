package code017;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo135List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);
        System.out.println("==========");

        //将指定元素添加到该集合中的指定位置上
        list.add(4, "e");
        System.out.println(list);
        System.out.println("==========");

        //移除列表中指定位置的元素，返回的是被移除的元素
        String s1 = list.remove(4);
        System.out.println("移除的元素是：" + s1);
        System.out.println(list);
        System.out.println("==========");

        //用指定元素替换集合中指定位置的元素，返回的是更新前的元素
        String s2 = list.set(4, "A");
        System.out.println("替换前的元素是：" + s2);
        System.out.println(list);
        System.out.println("==========");

        //遍历集合的三种方式
        //普通for循环遍历
        System.out.println("for循环遍历");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==========");
        //迭代器遍历
        System.out.println("迭代器遍历");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("==========");
        //增强for循环遍历
        System.out.println("增强for循环遍历");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
