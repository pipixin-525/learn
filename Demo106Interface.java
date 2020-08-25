package code014;

import java.util.ArrayList;
import java.util.List;

public class Demo106Interface {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        addName(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static List<String> addName(List<String> list) {
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        return list;
    }
}
