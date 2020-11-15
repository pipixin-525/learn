package code021;

/*
用Lambda表达式完成对两个数字的相加
 */
public class Demo175CalculatorImpl {
    public static void main(String[] args) {
        calculator(120, 130, (int a, int b) -> {
            return a + b;
        });

        //优化省略
        calculator(120, 130, (int a, int b) -> a + b);
    }

    public static int calculator(int a, int b, Demo175Calculator cal) {
        int sum = cal.cali(a, b);
        System.out.println(sum);
        return sum;
    }
}
