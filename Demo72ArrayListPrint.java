package code008;

import java.util.ArrayList;

/*
题目：
定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起集合，使用@分隔每个元素。
格式参照：{元素@元素@元素}
 */
public class Demo72ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list);
        printArrayList(list);

    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1) {
                System.out.println(name + "}");
            } else {
                System.out.print(name + "@");
            }
        }
    }
}
