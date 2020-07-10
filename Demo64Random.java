package code007;

import java.util.Random;

public class Demo64Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是：" + num);

        for (int i = 10; i > 0; i--) {
            int num2 = r.nextInt(3);//范围实际上是0~2
            System.out.print(num2 + "  ");
        }
    }
}
