package code003;
/*
题目要求：
定义一个方法，用来判断两个数字是否相同
 */
public class Demo31MethodSame {
    public static void main(String[] args) {
        isSame1(10,10);//第一种方法(不带返回值)  数字相同
        System.out.println(isSame2(10,20));//第二种方法  false
        System.out.println(isSame3(10,10));//第三种方法  true
        System.out.println(isSame4(10,20));//第四种方法  false
        System.out.println(isSame5(10,10));//第五种方法  true
    }
    public static void isSame1(int a, int b){
        if(a == b){
            System.out.println("数字相同");
        }else{
            System.out.println("数字不相同");
        }
    }
    public static boolean isSame2(int a, int b){
        boolean same;
        if(a == b){
            same = true;
        }else {
            same = false;
        }
        return same;
    }
    public static boolean isSame3(int a, int b){
        boolean same = a == b ? true : false;
        return same;
    }
    public static boolean isSame4(int a, int b){
        boolean same = a == b;
        return same;
    }
    public static boolean isSame5(int a, int b){
        return a == b;
    }
}
