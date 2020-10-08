package code017;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo137Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        //set.add(1);

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) { 
            Integer next = it.next();
            System.out.println(next);
        }
    }
}
