package code015;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo128Iterator {
    public static void main(String[] args) {

        Collection<String> array = new ArrayList<>();
        array.add("aaa");
        array.add("bbb");
        array.add("ccc");
        array.add("ddd");
        array.add("eee");
        array.add("fff");

        Iterator<String> it = array.iterator();


        while (it.hasNext()){
            String n = it.next();
            System.out.println(n);
        }


    }
}
