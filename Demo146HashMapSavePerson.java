package code018;

import code017.Demo140Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo146HashMapSavePerson {
    public static void main(String[] args) {

        HashMap<Demo140Person, String> map = new HashMap<>();
        map.put(new Demo140Person("yx1", 20), "深圳");
        map.put(new Demo140Person("yx2", 20), "广州");
        map.put(new Demo140Person("yx3", 20), "杭州");
        map.put(new Demo140Person("yx1", 20), "上海");

        Set<Map.Entry<Demo140Person, String>> set = map.entrySet();
        for (Map.Entry<Demo140Person, String> entry : set) {
            Demo140Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-" + value);
        }
    }
}
