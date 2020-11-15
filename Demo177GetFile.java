package code022;

import java.io.File;

public class Demo177GetFile {
    public static void main(String[] args) {
        System.out.println("获取文件的绝对路径");
        show1();
        System.out.println("获取文件的路径");
        show2();
        System.out.println("获取文件/目录的名称");
        show3();
        System.out.println("返回文件长度");
        show4();
    }

    public static void show1() {
        File file1 = new File("F:" + File.separator + "basic-code" + File.separator + "Hello.java");
        String absolutePath1 = file1.getAbsolutePath();
        File file2 = new File("Hello.java");
        String absolutePath2 = file2.getAbsolutePath();
        System.out.println(absolutePath1);
        System.out.println(absolutePath2);
    }

    public static void show2() {
        File file1 = new File("F:" + File.separator + "basic-code" + File.separator + "Hello.java");
        String path1 = file1.getPath();
        File file2 = new File("Hello.java");
        String path2 = file2.getPath();
        System.out.println(path1);
        System.out.println(path2);
    }

    public static void show3() {
        File file1 = new File("F:" + File.separator + "basic-code" + File.separator + "Hello.java");
        String name1 = file1.getName();
        File file2 = new File("F:" + File.separator + "basic-code");
        String name2 = file2.getName();
        System.out.println(name1);
        System.out.println(name2);
    }

    public static void show4() {
        //文件不存在，则长度为0
        File file1 = new File("F:" + File.separator + "basic-code" + File.separator + "Hello.java");
        long length = file1.length();
        System.out.println(length);
    }
}
