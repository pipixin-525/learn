package code009;

public class Demo91Zi extends Demo91Fu {

    int num = 20;

    public Demo91Zi() {
        //在子类的构造方法中，访问父类的构造方法。
        super();
    }

    public Demo91Zi(int num) {
        //在本类成员方法中，访问本类的另一个构造方法。
        this();
    }

    public void methodZi() {
        int num = 30;
        System.out.println(num);

        //在本类成员方法中，访问本类的成员变量。
        System.out.println(this.num);

        //在子类成的员方法中，访问父类的成员变量。
        System.out.println(super.num);
    }

    //覆盖重写
    @Override
    public void method() {

        //在子类的成员方法中，访问父类的成员方法。
        super.method();
        System.out.println("子类方法");
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {

        //在本类成员方法中，访问本类的另一个成员方法。
        this.methodA();
        System.out.println("BBB");
    }
}
