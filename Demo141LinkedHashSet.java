package code017;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo141LinkedHashSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("bbb");
        set.add("aaa");
        set.add("aaa");
        set.add("ccc");
        System.out.println(set);//[aaa, ccc, bbb]

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("bbb");
        linked.add("aaa");
        linked.add("aaa");
        linked.add("ccc");
        System.out.println(linked);//[bbb, aaa, ccc]
    }
}
