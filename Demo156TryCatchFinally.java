package code019;

import java.io.IOException;

public class Demo156TryCatchFinally {
    public static void main(String[] args) {

        try {
            method("c:\\a.doc");
        } catch (IOException e) {
            System.out.println("Catch-文件格式有误");
        } finally {
            System.out.println("资源释放");
        }
        System.out.println("后续代码");

    }

    public static void method(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException();
        }
        System.out.println("读取文件");
    }
}
