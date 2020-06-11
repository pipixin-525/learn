package code005;

public class Demo43ArrayParam {
    public static void main(String[] args) {
        int[] array = {10 , 20 , 30 , 40 , 50};
        printArray(array);//传递了数组的地址值
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
