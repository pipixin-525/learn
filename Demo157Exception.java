package code019;

import java.util.List;

public class Demo157Exception {
    public static void main(String[] args) {

        method1();
        System.out.println("==========");
        method2();
        System.out.println("==========");
        method3();
        System.out.println("==========");
        System.out.println("后续代码");
    }

    //多个异常分别处理
    public static void method1() {
        int[] array = {1, 2, 3};
        List<Integer> list = List.of(1, 2, 3);
        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界异常！");
        }

        try {
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("下标越界异常！");
        }
    }

    //多个异常一次捕获，多次处理
    public static void method2() {
        int[] array = {1, 2, 3};
        List<Integer> list = List.of(1, 2, 3);
        try {
            System.out.println(array[3]);
            System.out.println(list.get(3));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界异常！");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("下标越界异常！");
        }
    }

    //多个异常一次捕获，一次处理
    public static void method3() {
        int[] array = {1, 2, 3};
        List<Integer> list = List.of(1, 2, 3);
        try {
            System.out.println(array[3]);
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
