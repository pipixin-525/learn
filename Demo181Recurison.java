package code022;

/*
定义一个方法，递归计算1-n的和
 */
public class Demo181Recurison {
    //static int result = 0;

    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    public static int sum(int i) {

        if (i == 1) {
            return 1;
        }
        return i + sum(i - 1);
        /*if (i == 0) {
            return result;
        }
        result = result + i;
        return sum(--i);*/
    }
}
