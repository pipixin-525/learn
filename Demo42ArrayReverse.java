package code005;
/*
题目：数组元素反转
要求：不能使用新的数组，就用原来唯一一个数组。
 */
public class Demo42ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10 , 20 ,30 ,40 , 50};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);//遍历打印数组本来的样子
        }
        System.out.println("==========");

        for(int min = 0, max = array.length - 1;min < max;min++, max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;//使用第三个变量到手
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);//遍历打印数组反转元素后的样子
        }
    }
}