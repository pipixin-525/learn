package code002;

public class Demo30MethodReturn {
    public static void main(String[] args) {
        getsum(5,6);//有返回值没有用到的单独调用

        int num = getsum(10,20);
        System.out.println("结果是" + num);//有返回值的赋值调用

        System.out.println("结果是" + getsum(2,3));//有返回值的打印调用

        System.out.println("==========");

        printsum(10,20);//无返回值的单独调用调用
    }
    public static int getsum(int a,int b){
        int result = a + b;
        return result;
    }
    public static void printsum(int a,int b){
        int result = a + b;
        System.out.println("结果是" + result);
    }
}
