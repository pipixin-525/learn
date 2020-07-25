package code010;

import java.util.ArrayList;

public class Demo93Main {
    public static void main(String[] args) {
        Demo93Manager manager = new Demo93Manager("群主", 100);

        Demo93Member one = new Demo93Member("成员A", 0);
        Demo93Member two = new Demo93Member("成员B", 0);
        Demo93Member three = new Demo93Member("成员C", 0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==========");

        //群主总共发20块钱，分三个红包。
        ArrayList<Integer> redlist = manager.send(20, 3);

        //三个普通成员收红包。
        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);

        manager.show();

        //6、6、8随机分给三个人。
        one.show();
        two.show();
        three.show();
    }
}
