package code017;

import java.util.LinkedList;

public class Demo136LinkedList {
    public static void main(String[] args) {
        add();
        System.out.println("==========");
        get();
        System.out.println("==========");
        remove();
    }

    public static void add() {
        //因为不能使用子类的特殊方法，所以不使用多态
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //将指定元素插入此列表的开头
        list.addFirst("Y");
        //等效于将元素推入此列表所示的堆栈list.push("Y");
        System.out.println(list);
        //将指定元素插入此列表的末尾
        list.addLast("X");
        //等效于list.add("X");
        System.out.println(list);
    }

    public static void get() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //返回此列表的第一个元素
        String first = list.getFirst();
        System.out.println("该列表的第一个元素是：" + first);
        //返回此列表的最后一个元素
        String last = list.getLast();
        System.out.println("该列表的最后一个元素是：" + last);
    }

    public static void remove() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //若列表为空，则抛出异常NoSuchElementException
        //list.clear();

        // list.isEmpty()：若列表不为空则返回true
        if (!list.isEmpty()) {
            //移除并返回列表的第一个元素
            String removeFirst = list.removeFirst();
            //相当于list.pop();
            System.out.println("移除的第一个元素是：" + removeFirst);
            //移除并返回列表的最后一个元素
            String removeLast = list.removeLast();
            System.out.println("移除的最后一个元素是：" + removeLast);
            System.out.println(list);
        }
        System.out.println(list);
    }

}
