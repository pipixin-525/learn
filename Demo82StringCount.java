package code008;

import java.util.ArrayList;
import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母、小写字母、数字、其他

Scaaner类
转换成为底层字节数组
if（）
分为4个数组，求出数组长度。

此代码缺陷：当输入汉字时：
gbk是2个字节
utf-8是3或者4字节
utf-16是2或者4字节
会导致结果不准确，所以应当用方法2，使用char字符计数。

 */
public class Demo82StringCount {
    public static void main(String[] args) {
        System.out.println("请输入一串字符：");
        Scanner sc = new Scanner(System.in);
        String array1 = sc.next();

        byte[] array2 = array1.getBytes();

        ArrayList array3 = new ArrayList<>();
        ArrayList array4 = new ArrayList<>();
        ArrayList array5 = new ArrayList<>();
        ArrayList array6 = new ArrayList<>();

        for (int i = 0; i < array2.length; i++) {
            if (65 <= array2[i] && array2[i] <= 90) {
                //大写字母
                boolean add = array3.add(array2[i]);
            } else if (97 <= array2[i] && array2[i] <= 122) {
                //小写字母
                boolean add = array4.add(array2[i]);
            } else if (48 <= array2[i] && array2[i] <= 57) {
                boolean add = array5.add(array2[i]);
            } else {
                //其他字符
                boolean add = array6.add(array2[i]);
            }
        }
        System.out.println("大写字母出现的次数是：" + array3.size());
        System.out.println("小写字母出现的次数是：" + array4.size());
        System.out.println("数字出现的次数是：" + array5.size());
        System.out.println("其他字符出现的次数是：" + array6.size());
        System.out.println(array2.length);


    }
}
