package code002;

public class Demo29MethodParam {
    public static void main(String[] args) {
        method1(10,20); //调用有参方法
        method2(); //调用无参方法
    }
    public static void method1(int a,int b){
        int resulr = a * b;
        System.out.println("结果是" + resulr);
    }
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello,Word!" + i);
        }
    }
}
