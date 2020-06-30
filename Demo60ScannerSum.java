package code007;

import java.util.Scanner;

/*
题目：键盘输入两个int数字，求出和值
 */
public class Demo60ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();

        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("和是：" + sum);
    }
}
