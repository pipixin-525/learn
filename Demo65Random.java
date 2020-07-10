package code007;

import java.util.Random;
import java.util.Scanner;

/*
题目要求：
根据int变量的值，来获取随机数字，范围是[1,n]，可以取到1，也可以取到n。
 */
public class Demo65Random {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("请输入要生成的随机的范围：");
        int n = s.nextInt();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(n) + 1;
            //int num = r.nextInt(n + 1);错误写法，这样会取到0
            System.out.println(num);

            /*同样可以达到目的
            int num = r.nextInt(n);
            System.out.println(num + 1);
            */
        }
    }
}
