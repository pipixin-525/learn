package code015;

import java.util.ArrayList;
import java.util.Collection;

public class Demo127Collection {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        //把给定的对象添加到集合中

        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        System.out.println(coll);
        System.out.println("====================");

        //把给定的对象在当前集合中删除
        boolean b1 = coll.remove("王五");
        boolean b2 = coll.remove("王三");
        System.out.println("查询是否有“王五”：" + b1);
        System.out.println("查询是否有“王三”：" + b2);
        System.out.println(coll);
        System.out.println("====================");

        //判断当前集合中是否包含给定对象
        boolean b3 = coll.contains("张三");
        boolean b4 = coll.contains("张一");
        System.out.println("是否包含“张三”：" + b3);
        System.out.println("是否包含“张一”：" + b4);
        System.out.println("====================");

        //判断当前集合是否为空
        boolean b5 = coll.isEmpty();
        System.out.println("当前集合是否为空：" + b5);
        System.out.println("====================");

        //返回集合中元素个数
        int size = coll.size();
        System.out.println("集合中一共有" + size + "个元素");
        System.out.println("====================");

        //把集合中的元素储存到数组中
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("====================");


        //清空集合中所有元素
        coll.clear();
        System.out.println(coll);
        boolean b6 = coll.isEmpty();
        System.out.println("集合是否为空：" + b6);

    }
}
