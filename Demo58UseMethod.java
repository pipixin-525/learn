package code007;

//import code007.Demo57Method;
public class Demo58UseMethod {
    public static void main(String[] args) {
        Demo57Method per1 = new Demo57Method();//无参构造
        Demo57Method per2 = new Demo57Method("pipixin", 21);//有参构造
        System.out.println("姓名：" + per2.getName() + "年龄：" + per2.getAge());

        per2.setAge(22);
        System.out.println("姓名：" + per2.getName() + "年龄：" + per2.getAge());
    }
}
