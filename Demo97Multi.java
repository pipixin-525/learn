package code012;

public class Demo97Multi {

    public static void main(String[] args) {

        //使用多态的写法，父类引用指向子类对象
        Demo97Fu obj = new Demo97Zi();

        obj.method();
        obj.methodFu();
        System.out.println("==========");

        System.out.println(obj.num);
        //System.out.println(obj.age);//错误写法！

        //子类没有覆盖重写，就是父：10
        //子类如果覆盖重写，就是子：20
        obj.showNum();
    }
}
