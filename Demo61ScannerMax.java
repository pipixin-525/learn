package code007;

import java.util.Scanner;

/*
题目：从键盘输入3个int数字，求出最大值。
 */
public class Demo61ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();

        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();

        System.out.println("请输入第三个数字：");
        int num3 = sc.nextInt();


/*
        if (num1 > num2) {
            System.out.println("最大值是：" + num1);
        } else if (num2 > num3) {
            System.out.println("最大值是：" + num2);
        } else {
            System.out.println("最大值是：" + num3);
        }

 */
//更简洁
        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;
        System.out.println("最大值是：" + max);

    }

}
