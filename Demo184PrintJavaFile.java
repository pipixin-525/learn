package code022;
/*
递归打印多级目录的所有文件中的Java文件
 */

import java.io.File;

public class Demo184PrintJavaFile {
    public static void main(String[] args) {
        show("F:" + File.separator + "basic-code");
    }

    public static void show(String path) {
        File file = new File(path);
        File[] list = file.listFiles();
        for (File f : list) {
            if (f.isDirectory()) {
                show(path + File.separator + f.getName());
            } else {
                String s = f.toString();
                if (s.endsWith("java")) {
                    System.out.println(f.getName());
                }
                /*if (f.getName().getBytes()[f.getName().getBytes().length - 1] == 'a'
                        && f.getName().getBytes()[f.getName().getBytes().length - 2] == 'v'
                        && f.getName().getBytes()[f.getName().getBytes().length - 3] == 'a'
                        && f.getName().getBytes()[f.getName().getBytes().length - 4] == 'j') {
                    System.out.println(f.getName());}*/
            }
        }
    }
}

