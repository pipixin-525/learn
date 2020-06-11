package code006;

import java.util.Arrays;

public class Demo45PrintArray {
    public static void main(String[] args) {
        int[] array = {10 , 20 , 30 , 40 , 50};
        //要求打印格式为：[10, 20, 30, 40, 50]
        //使用面向过程编程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if( i == array.length - 1){
                System.out.println(array[i] + "]");
            }else{
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("====================");

        //面向对象编程
        System.out.println(Arrays.toString(array));
    }
}
