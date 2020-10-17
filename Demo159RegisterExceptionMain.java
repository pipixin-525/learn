package code019;

import java.util.Scanner;

/*
    模拟注册操作，如果用户名已存在，则抛出异常并提示：该用户名已被注册。
 */
public class Demo159RegisterExceptionMain {

    static String[] userName = {"张三", "李四", "王五"};

    public static void main(String[] args) /*throws Demo159RegisterException*/ {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要注册的用户名：");
        String username = sc.next();
        checkUsername(username);
    }

    public static void checkUsername(String username) /*throws Demo159RegisterException*/ {
        for (String name : userName) {
            if (name.equals(username)) {
                try {
                    throw new Demo159RegisterException("该用户名已被注册！");
                } catch (Demo159RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("注册成功！");
    }
}
