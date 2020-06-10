package code005;

public class Demo38ArrayUse {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA);//内存地址值
        System.out.println(arrayA[0]);//默认值 0
        System.out.println(arrayA[1]);//默认值 0
        System.out.println(arrayA[2]);//默认值 0
        System.out.println("==========");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);//内存地址值不变
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//10
        System.out.println(arrayA[2]);//20
        System.out.println("==========");

        int[] arrayB = arrayA;//将数组A的内存地址值给数组B
        System.out.println(arrayB);//等于数组A的内存地址值
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//数组A赋值过的10
        System.out.println(arrayB[2]);//数组A赋值过的20
        System.out.println("==========");

        arrayB[1] = 100;//重新赋值
        arrayB[2] = 200;//重新赋值
        System.out.println(arrayB);//内存地址值不变
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//100
        System.out.println(arrayB[2]);//200
        System.out.println("==========");

        System.out.println(arrayA);//内存地址值不变
        System.out.println(arrayA[0]);//0
        System.out.println(arrayA[1]);//数组B赋值过的100
        System.out.println(arrayA[2]);//数组B赋值过的200
    }
}
