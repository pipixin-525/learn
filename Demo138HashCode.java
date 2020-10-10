package code017;

public class Demo138HashCode {
    public static void main(String[] args) {

        Demo138Person per1 = new Demo138Person();
        int i1 = per1.hashCode();
        System.out.println(i1);

        Demo138Person per2 = new Demo138Person();
        int i2 = per2.hashCode();
        System.out.println(i2);

        System.out.println(per1);
        System.out.println(per2);

        System.out.println(per1 == per2);
        System.out.println("==========");

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // 特殊字符串
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());


    }
}
