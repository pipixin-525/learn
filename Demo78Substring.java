package code008;

public class Demo78Substring {
    public static void main(String[] args) {
        String str1 = "HelloWord";

        String str2 = str1.substring(0, 5);
        System.out.println(str2);

        String str3 = str1.substring(5);
        System.out.println(str3);

        String str4 = str2.concat(str3);
        System.out.println(str4);

    }
}
