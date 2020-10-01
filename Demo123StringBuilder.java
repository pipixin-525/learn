package code015;

public class Demo123StringBuilder {
    public static void main(String[] args) {
        String b1 = "abc";
        StringBuilder b2 = new StringBuilder(b1);
        System.out.println("b1:" + b1);

        b2.append("d");
        b2.append(1);
        b2.append(true);
        System.out.println("b2:" + b2);

        StringBuilder b3 = b2.append(123);
        System.out.println("b2:" + b2);
        System.out.println("b3:" + b3);
        System.out.println(b2 == b3);

        StringBuilder b4 = new StringBuilder();
        b4.append(1).append(2).append(3).append(4).append(5);
        System.out.println("b4:" + b4);

        String b5 = b4.toString();
        System.out.println("b5:" + b5);
    }
}
