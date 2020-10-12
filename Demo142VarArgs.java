package code017;

public class Demo142VarArgs {
    public static void main(String[] args) {

        //int i = add();
        //int i = add(10);
        //int i = add(10,20);
        int i = add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        System.out.println(i);
        method1("abc", 1.1, true, 1, 2, 3, 4, 5);
        method2("abc", 1.1, true, 1, 2, 3, 4, 5);
    }

    /*
        定义计算（0-n）整数和的方法
        已知：计算整数的和，数据类型已经确定int
        但是参数的个数不确定，不知道要计算几个整数的和，就需要用可变参数
        add();会创建一个长度为0的数组，new int[0]
        add(10);会创建一个长度为1的数组，new int[10]
        add(10,20);会创建一个长度为2的数组，new int[10,20]
        add(10,20,30,40,50,60,70,80,90,100);会创建一个长度为10的数组，new int[10,20,30,40,50,60,70,80,90,100]
     */
    public static int add(int... arr) {
        //System.out.println(arr);//[I@5fd0d5ae 底层是一个数组
        //System.out.println(arr.length);

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    //一个方法列表，最多只能有一个可变参数
    //如果方法的参数有多个，可变参数必须写在参数列表的末尾
    public static void method1(String s, double d, boolean b, int... i) {
    }

    public static void method2(Object... obj) {
    }
}
