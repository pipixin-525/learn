package code022;

import java.io.File;
import java.io.IOException;

public class Demo179NewAndDeleteFile {
    public static void main(String[] args) throws Exception {
        //创建文件
        newFile();
        //删除文件/文件夹
        deleteFile();
        //创建单极文件夹
        newDir();
        //创建多级文件夹
        newDirs();
    }

    public static void newFile() throws Exception {
        File file = new File("C:" + File.separator + "Users" + File.separator
                + "Administrator" + File.separator + "Desktop" + File.separator + "Hello.txt");
        System.out.println(file.createNewFile());

    }

    public static void deleteFile() {
        File file = new File("C:" + File.separator + "Users" + File.separator
                + "Administrator" + File.separator + "Desktop" + File.separator + "Hello.txt");
        System.out.println(file.delete());
    }

    public static void newDir() {
        File file = new File("C:" + File.separator + "Users" + File.separator
                + "Administrator" + File.separator + "Desktop" + File.separator + "Hello");
        System.out.println(file.mkdir());

    }

    public static void newDirs() {
        File file = new File("C:" + File.separator + "Users" + File.separator
                + "Administrator" + File.separator + "Desktop" + File.separator
                + "Hello" + File.separator + "java");
        System.out.println(file.mkdirs());
    }
}

