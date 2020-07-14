package code008;

import java.util.ArrayList;

/*
题目：
自定义4个学生对象，添加到集合，并遍历。
 */
public class Demo71ArrayListPerson {
    public static void main(String[] args) {
        ArrayList<StandardPerson> list = new ArrayList<>();

        StandardPerson one = new StandardPerson("张三", 20);
        StandardPerson two = new StandardPerson("李四", 21);
        StandardPerson three = new StandardPerson("王五", 22);
        StandardPerson four = new StandardPerson("赵六", 23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            StandardPerson per = list.get(i);
            System.out.println("姓名：" + per.getName() + "，年龄：" + per.getAge());
        }

    }
}
