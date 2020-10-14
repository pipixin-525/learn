package code018;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo150JDK9 {
    public static void main(String[] args) {

        List<String> list = List.of("a", "b", "c", "d", "a");
        //list.add("w");//UnsupportedOperationException
        System.out.println(list);

        Set<String> set = Set.of("a", "b", "c", "d");
        //Set<String> set = Set.of("a", "b", "c", "d","a");//IllegalArgumentException
        //set.add("w");//UnsupportedOperationException
        System.out.println(set);

        Map<String, Integer> a = Map.of("a", 1, "b", 2, "c", 3, "d", 4);
        //Map<String, Integer> a = Map.of("a", 1, "b", 2, "c", 3, "d", 4, "a", 5);//IllegalArgumentException
        //a.put("e",5);//UnsupportedOperationException
        System.out.println(a);
    }
}
