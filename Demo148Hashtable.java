package code018;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo148Hashtable {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", null);
        map.put(null, 2);
        map.put(null, null);
        System.out.println(map);

        Hashtable<String, Integer> table = new Hashtable<>();
        /*
        table.put("a", null);//NullPointerException
        table.put(null, 2);//NullPointerException
        table.put(null, null);//NullPointerException
        System.out.println(table);
        */
    }
}
