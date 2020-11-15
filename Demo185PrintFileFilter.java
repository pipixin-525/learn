package code022;
/*
使用过滤器递归打印多级目录的所有文件中的Java文件
 */

import java.io.File;

public class Demo185PrintFileFilter {
    public static void main(String[] args) {
        show("F:" + File.separator + "basic-code");
    }

    public static void show(String path) {
        File file = new File(path);
        File[] list = file.listFiles(file1 -> {
            if (file1.isDirectory()) {
                return true;
            } else {
                if (file1.toString().endsWith("java")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (File f : list) {
            if (f.isDirectory()) {
                show(path + File.separator + f.getName());
            } else {
                System.out.println(f.getName());
            }
        }
    }
}
