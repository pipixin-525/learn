package code008;

public class Demo77StringGet {
    public static void main(String[] args) {
        //获取字符串长度
        int length = "jdisaolnfieuoapnmcvkdsa".length();
        System.out.println("字符串的长度是：" + length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "Word";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("==========");

        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);
        System.out.println("==========");

        //查找参数字符串在原来字符串当中出现的第一次索引位置
        //如果没有，返回-1值
        String or = "Hello word";
        int a = or.indexOf("r");
        int b = or.indexOf("x");
        System.out.println("第一次索引值是：" + a);
        System.out.println("第一次索引值是：" + b);

    }
}
