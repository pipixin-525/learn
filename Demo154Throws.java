package code019;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo154Throws {
    public static void main(String[] args) throws IOException {

        //method("d:\\a.txt");
        method2("c:\\a.doc");

    }

    public static void method(String fileName) throws FileNotFoundException {
        if (!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("文件没有找到");
        }
    }

    public static void method2(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件后缀名不对");
        }
    }
}
