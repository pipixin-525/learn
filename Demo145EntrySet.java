package code018;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo145EntrySet {
    public static void main(String[] args) {

        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println(map);
        System.out.println("==========");

        //使用Map集合中的方法entrySet();把集合中的多个Entry对象取出来，储存到一个Set集合中
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        //获取迭代器
        Iterator<Map.Entry<String, Integer>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            //使用Entry对象中的方法getKey()和getValue()获取键与值
            String s = entry.getKey();
            Integer n = entry.getValue();
            System.out.println(s + "=" + n);
        }
        System.out.println("==========");

        //使用增强for循环遍历
        for (Map.Entry<String, Integer> entry : set) {
            //使用Entry对象中的方法getKey()和getValue()获取键与值
            String s = entry.getKey();
            Integer n = entry.getValue();
            System.out.println(s + "=" + n);
        }
    }
}
