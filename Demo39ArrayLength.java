package code005;

public class Demo39ArrayLength {
    public static void main(String[] args) {
        int [] arrayA = {1 , 5 , 9 , 4 , 8 , 5 , 48 ,89 ,9 ,7  , 87 ,8 , 98 , 98 , 97 , 89 , 4 , 56};
        int num = arrayA.length;
        System.out.println("这个数组的长度是" + num);

        int [] arrayB = new int[3];
        System.out.println(arrayB);
        arrayB = new int[5];//并不是改变了数组的长度，而是将新的数组赋值给arrayB
        System.out.println(arrayB);//改变了内存地址值
    }
}
