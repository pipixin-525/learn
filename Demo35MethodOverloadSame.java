package code004;
/*
 题目要求：
 比较两个数据是否相等。
 参数类型分别为俩个byte类型，两个short类型，两个int类型，两个long类型，并在main方法中进行测试。
 */
public class Demo35MethodOverloadSame {
    public static void main(String[] args) {
        System.out.println(isSame((byte)1,(byte)2));//false
        System.out.println(isSame((short)100,(short)100));//true
        System.out.println(isSame(1000,2000));//false
        System.out.println(isSame( 1000000L,1000000L));//true
    }
    public static boolean isSame(byte a,byte b){
        System.out.println("调用了byte对比方法");
        return a == b;
    }
    public static boolean isSame(short a,short b){
        System.out.println("调用了short对比方法");
        return a == b;
    }
    public static boolean isSame(int a,int b){
        System.out.println("调用了int对比方法");
        return a == b;
    }
    public static boolean isSame(long a,long b){
        System.out.println("调用了long对比方法");
        return a == b;
    }
}
