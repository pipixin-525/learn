package code005;

public class Demo36ArrayUse {
    public static void main(String[] args) {
        int[] array1 = new int[]{10 , 20 , 30};
        int[] array2 = {40 , 50 , 60};//静态初始化省略格式

        System.out.println(array1);//内存地址值
        System.out.println(array1[0]);//10
        System.out.println(array1[1]);//20
        System.out.println(array1[2]);//30

        int num =array2[1];
        System.out.println(num);//50
    }
}
