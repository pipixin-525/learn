package code022;

import java.io.File;

/*
递归打印多级目录和所有文件
 */
public class Demo183PrintDirFile {
    public static void main(String[] args) {
        show("F:" + File.separator + "basic-code");
    }

    public static void show(String path) {
        File file = new File(path);
        File[] list = file.listFiles();
        for (File f : list) {
            if (f.isDirectory()) {
                System.out.println(f.getName());
                show(path + File.separator + f.getName());
            } else {
                System.out.println(f.getName());
            }
        }
    }
}
