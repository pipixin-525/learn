package code015;

public class Demo108Equals {

    public static void main(String[] args) {
        Demo108Person p1 = new Demo108Person("yx", 22);
        Demo108Person p2 = new Demo108Person("ykm", 22);
        Demo108Person p3 = new Demo108Person("yx", 22);

        boolean b1 = p1.equals(p2);
        boolean b2 = p1.equals(p3);
        System.out.println(b1);
        System.out.println(b2);
    }
}
