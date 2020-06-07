package code004;

public class Demo34MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));//两个参数的方法
        System.out.println(sum(10,20,30));//三个参数的方法
        System.out.println(sum(10,20,30,40));//四个参数的方法
    }
    public static int sum(int a,int b){
        System.out.println("有2个参数的方法执行");
        return a + b;
    }
    public static int sum(int a,int b,int c){
        System.out.println("有3个参数的方法执行");
        return a + b + c;
    }
    public static int sum(int a,int b,int c,int d){
        System.out.println("有4个参数的方法执行");
        return a + b + c +d;
    }
}
