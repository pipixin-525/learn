package code003;
/*
题目要求：
定义一个方法：用来打印指定次数的Hello，Word。
 */
public class Demo33MothodPrint {
    public static void main(String[] args) {
        printCound1(10);//无返回值
        System.out.println("==========");
        printCound2(10);//有返回值
    }
    public static void printCound1(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("Hello,Word!");
        }
    }
    public static int printCound2(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("Hello,Word!");
        }
        return a;
    }
}
