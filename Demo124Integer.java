package code015;

public class Demo124Integer {
    public static void main(String[] args) {

        //装箱
        //构造方法
        Integer n1 = new Integer(1);//有横线说明方法过时
        System.out.println(n1);
        Integer n2 = new Integer("1");
        System.out.println(n2);

        //静态方法
        Integer n3 = Integer.valueOf(1);
        System.out.println(n3);
        //Integer n4 = Integer.valueOf("a");NumberFormatException：数字格式化异常
        Integer n4 = Integer.valueOf("1");
        System.out.println(n4);

        System.out.println("=====");

        //拆箱
        int i = n1.intValue();
        System.out.println(i);
    }
}
