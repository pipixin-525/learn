package code008;

public class Demo76StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        String str4 = "hello";
        System.out.println(str1.equals(str4));
        System.out.println("=====");

        String str5 = null;
        System.out.println("abc".equals(str5));
//        System.out.println(str5.equals("abc")); // 空指针异常
        System.out.println("=====");

        String str6 = "JAVA";
        String str7 = "java";
        System.out.println(str6.equals(str7));
        System.out.println(str6.equalsIgnoreCase(str7));



    }
}
