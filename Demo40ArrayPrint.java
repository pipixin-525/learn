package code005;

public class Demo40ArrayPrint {
    public static void main(String[] args) {
        int[] arrayA = new int[]{10 , 20 , 30 , 40};

        //原始输出
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println(arrayA[3]);
        System.out.println("==========");

        //使用循环
        for (int i = 0; i < 4; i++) {
            System.out.println(arrayA[i]);
        }
        System.out.println("==========");

        //使用循环输出，次数为数组长度
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
    }
}
