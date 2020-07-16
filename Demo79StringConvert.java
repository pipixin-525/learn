package code008;

public class Demo79StringConvert {
    public static void main(String[] args) {

        //转换为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("==========");

        //转换为字符数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==========");

        //字符串的内容替换
        String str1 = "Hello";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);

    }
}
