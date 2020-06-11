package code005;

public class Demo44ArrayReturn {
    public static void main(String[] args) {
        int[] result =  calculate(10,20,30);
        System.out.println(result);//接收到内存地址值

        System.out.println("总和：" + result[0]);
        System.out.println("平均值：" + result[1]);
    }
    public static int[] calculate(int a,int b,int c){
        int sum = a + b + c;
        int avg = sum / 3;

        /*int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;*/

        int[] array = {sum , avg};
        return array;//返回一个数组
    }
}
