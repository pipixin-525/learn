package code022;

import java.io.File;

public class Demo180SearchFile {
    public static void main(String[] args) {
        searchFile();
        System.out.println("=========");
        searchF();
    }

    public static void searchFile() {
        File file = new File("C:" + File.separator + "Users" + File.separator
                + "Administrator" + File.separator + "Desktop");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void searchF() {
        File file = new File("C:" + File.separator + "Users" + File.separator
                + "Administrator" + File.separator + "Desktop");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
