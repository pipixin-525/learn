package code007;

import java.util.Scanner;

public class Demo59Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//从键盘输入

        int num = sc.nextInt();
        System.out.println("输入的int数字是" + num);

        String str = sc.next();
        System.out.println("输入的字符串是" + str);
    }
}
