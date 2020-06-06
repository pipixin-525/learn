package code003;
/*
题目要求：
定义一个方法：求出1-100之间所有数字之和。
 */
public class Demo32MethodSum {
    public static void main(String[] args) {
        getSum1();//无返回值
        System.out.println("结果是" + getSum2());//有返回值
    }
    public static void getSum1(){
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            num += i;
        }
        System.out.println("结果是" + num);
    }
    public static int getSum2(){
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            num += i;
        }
        return num;
    }
}
