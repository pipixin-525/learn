package code022;

/*
定义一个方法，使用递归实现求出n的阶乘
 */
public class Demo182Recurison {
    public static void main(String[] args) {
        System.out.println(result(5));
    }

    public static int result(int n) {
        if (n == 1) {
            return 1;
        }
        return n * result(n - 1);
    }
}
