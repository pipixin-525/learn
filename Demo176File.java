package code022;

import java.io.File;

public class Demo176File {
    public static void main(String[] args) {
        show1("C:" + File.separator + "java" + File.separator + "Hello.java");
        show2("C:" + File.separator + "java", "Hello.java");
        File file = new File("C:" + File.separator + "java");
        show3(file, "Hello.java");
    }


    public static void show1(String pathname) {
        File file = new File(pathname);
        System.out.println(file);
    }

    public static void show2(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    public static void show3(File parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }
}
