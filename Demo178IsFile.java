package code022;

import java.io.File;

public class Demo178IsFile {
    public static void main(String[] args) {
        File file = new File("F:" + File.separator + "basic-code" + File.separator + "Hello.java");
        System.out.println("文件夹是否存在：" + file.exists());
        System.out.println("是否为目录：" + file.isDirectory());
        System.out.println("是否为文件：" + file.isFile());
    }
}
