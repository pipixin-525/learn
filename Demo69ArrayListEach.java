package code008;

import java.util.ArrayList;

public class Demo69ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        //遍历集合
        for(int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i));
        }
    }
}
