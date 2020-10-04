package code015;

import java.util.ArrayList;

public class Demo129Foreach {
    public static void main(String[] args) {
        array1();
        System.out.println("===");
        array2();
    }
    public static void array1() {
        int[] arr = {1 , 2 , 3 , 4};
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void array2() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        for(String s : arr) {
            System.out.println(s);
        }
    }
}
