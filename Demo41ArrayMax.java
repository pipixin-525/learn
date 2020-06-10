package code005;

/*
题目：输出一个数组中的最大值
想法：
创建一个数组
创建两个变量
将0号数组赋值给第一个变量
遍历一个数组
循环赋值给第二个变量
比较大小
if第一个大就留下，else第二个大就赋值给第一个变量
 */
public class Demo41ArrayMax {
    public static void main(String[] args) {
        A();//过程清楚
        B();//这种写法更简洁
    }
    public static void A() {
        int a;
        int b;
        int[] arrayA = new int[]{1, 2, 3, 4, 99, 5, 6, 7, 8, 9};
        a = arrayA[0];
        for (int i = 0; i < arrayA.length; i++) {
            b = arrayA[i];
            if (a >= b) {
                a += 0;
            } else {
                a = b;
            }
        }
        System.out.println("最大值：" + a);
    }


    public static void B() {
        int[] arrayA = new int[]{1, 2, 3, 4, 99, 5, 6, 7, 8, 9};
        int max = arrayA[0];
        for (
                int i = 1;
                i < arrayA.length; i++) {
            if (arrayA[i] > max) {
                max = arrayA[i];
            }
        }
        System.out.println("最大值：" + max);
    }
}
