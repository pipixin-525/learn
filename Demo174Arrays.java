package code021;
/*
用Lambda表达式完成对人的年龄升序排列
 */

import java.util.ArrayList;
import java.util.Collections;

public class Demo174Arrays {
    public static void main(String[] args) {

        ArrayList<Demo174Person> list = new ArrayList<>();
        list.add(new Demo174Person("yx1", 22));
        list.add(new Demo174Person("yx2", 20));
        list.add(new Demo174Person("yx3", 23));
        list.add(new Demo174Person("yx4", 21));

        Collections.sort(list, (Demo174Person t1, Demo174Person t2) -> {
            return t1.getAge() - t2.getAge();
        });

        //优化省略
        Collections.sort(list, (Demo174Person t1, Demo174Person t2) -> t1.getAge() - t2.getAge());

        System.out.println(list);
    }
}
