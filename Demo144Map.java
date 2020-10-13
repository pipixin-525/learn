package code018;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo144Map {
    public static void main(String[] args) {

        method1();
        System.out.println("==========");
        method2();
    }

    public static void method1() {
        //创建Map对象
        Map<String, String> map = new HashMap<>();
        //添加元素，若元素重复返回的是被替换的value值
        String s1 = map.put("a", "A");
        System.out.println("s1:" + s1);

        String s2 = map.put("a", "B");
        System.out.println("s2:" + s2);

        System.out.println(map);

        map.put("b", "B");
        map.put("c", "C");
        map.put("d", "D");
        System.out.println(map);
        System.out.println("==========");

        //移除元素，返回的是被删除的value值
        String s3 = map.remove("e");
        System.out.println("s3:" + s3);
        String s4 = map.remove("b");
        System.out.println("s4:" + s4);
        System.out.println(map);
        System.out.println("==========");

        //根据指定的键，获得值
        String s5 = map.get("c");
        System.out.println("s5:" + s5);
        System.out.println("==========");

        //判断否包含指定的键
        boolean b1 = map.containsKey("e");
        System.out.println("b1:" + b1);
        boolean b2 = map.containsKey("d");
        System.out.println("b2:" + b2);
    }

    public static void method2() {

        //创建Map对象
        Map<String, String> map = new HashMap<>();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");
        map.put("d", "D");
        System.out.println(map);
        System.out.println("==========");

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String n1 = it.next();
            System.out.println(n1 + "=" + map.get(n1));
        }
        System.out.println("==========");
        //增强for循环遍历
        for (String s1 : set) {
            System.out.println(s1 + "=" + map.get(s1));
        }
    }
}