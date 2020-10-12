package code017;

import java.util.HashSet;

public class Demo140HashSetSavePerson {
    public static void main(String[] args) {

        HashSet<Demo140Person> set = new HashSet<>();

        Demo140Person per1 = new Demo140Person("yx", 22);
        Demo140Person per2 = new Demo140Person("yx", 22);
        Demo140Person per3 = new Demo140Person("yx", 21);

        System.out.println(per1.hashCode());
        System.out.println(per2.hashCode());
        System.out.println(per1 == per2);
        System.out.println(per1.equals(per2));

        set.add(per1);
        set.add(per2);
        set.add(per3);
        System.out.println(set);
    }
}