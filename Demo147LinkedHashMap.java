package code018;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo147LinkedHashMap {
    public static void main(String[] args) {

        //有序的集合
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("a", "A");
        map.put("c", "C");
        map.put("b", "B");
        map.put("a", "D");
        System.out.println(map);

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next + "-" + map.get(next));
        }


    }
}
