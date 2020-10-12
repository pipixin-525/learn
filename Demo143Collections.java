package code017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo143Collections {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        //将一些元素一次性添加到集合中
        Collections.addAll(list1, "b", "a", "c", "e", "d");
        System.out.println("原集合：" + list1);
        //打乱集合中顺序
        Collections.shuffle(list1);
        System.out.println("打乱后：" + list1);
        //对集合中元素进行排序
        Collections.sort(list1);
        System.out.println("排序后：" + list1);
        System.out.println("====================");

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 7, 4, 1, 8, 5, 2, 9, 6, 3);
        System.out.println("原集合：" + list2);
        //对集合中元素进行排序
        Collections.sort(list2);
        System.out.println("排序后：" + list2);
        System.out.println("====================");

        ArrayList<Demo143Person> list3 = new ArrayList<>();
        list3.add(new Demo143Person("yx", 22));
        list3.add(new Demo143Person("yx", 20));
        list3.add(new Demo143Person("yx", 21));
        System.out.println("原集合：" + list3);
        //对集合中元素进行排序
        Collections.sort(list3);
        System.out.println("排序后：" + list3);
        System.out.println("====================");

        ArrayList<Integer> list4 = new ArrayList<>();
        Collections.addAll(list4, 7, 4, 1, 8, 5, 2, 9, 6, 3);
        System.out.println("原集合：" + list4);
        //将集合中元素按照指定规则进行排序
        Collections.sort(list4, new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                //升序
                return t1 - t2;
            }
        });
        System.out.println("排序后：" + list4);
        System.out.println("====================");

        ArrayList<Demo143Student> list5 = new ArrayList<>();
        list5.add(new Demo143Student("byx", 22));
        list5.add(new Demo143Student("yx", 23));
        list5.add(new Demo143Student("yx", 21));
        list5.add(new Demo143Student("ayx", 22));
        System.out.println("原集合：" + list5);
        //将集合中元素按照指定规则进行排序
        Collections.sort(list5, new Comparator<Demo143Student>() {
            @Override
            public int compare(Demo143Student t1, Demo143Student t2) {
                //按照年龄进行升序排序
                int result = t1.getAge() - t2.getAge();
                //如果两人的年龄相同，再用姓名第一个字母进行比较
                if (result == 0) {
                    result = t1.getName().charAt(0) - t2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println("排序后：" + list5);
    }
}
