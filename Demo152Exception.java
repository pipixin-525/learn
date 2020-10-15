package code019;

public class Demo152Exception {
    public static void main(String[] args) {

        //int[] arr1 = null;
        //getElement2(arr1, 3);

        int[] arr2 = {3};
        int e = getElement2(arr2, 3);
        System.out.println(e);

    }

    public static int getElement1(int[] arr, int index) {
        if (arr == null) {
            throw new NullPointerException("空指针异常！");
        }
        int ele = arr[index];
        return ele;
    }

    public static int getElement2(int[] arr, int index) {
        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("数组下标越界异常！");
        }
        int ele = arr[index];
        return ele;
    }
}
