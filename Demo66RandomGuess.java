package code007;

import java.util.Random;
import java.util.Scanner;

/*
题目：猜数字
生成一个[1,100]的随机数，猜一个数字会提示大了还是小了，直到猜中，游戏结束，并统计猜了多少次。
 */
public class Demo66RandomGuess {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int num1 = r.nextInt(100) + 1;
        int i = 1;
        while (true){
            System.out.println("猜一个1~100之间的数字：");
            int num2 =s.nextInt();
            if(num2 > num1){
                System.out.println("猜大了，请重试！");
            }else if(num2 < num1){
                System.out.println("猜小了，请重试！");
            }else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
            i ++;
        }
        System.out.println("游戏结束，一共猜了" + i + "次。");
    }
}
