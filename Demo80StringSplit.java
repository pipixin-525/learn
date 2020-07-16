package code008;

public class Demo80StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("==========");

        String str2 = "xxx.yyy.zzz";

//        String[] array2 = str2.split(".");
//        System.out.println(array2.length);//0

        String[] array3 = str2.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
