package code012;

public class Demo97Zi extends Demo97Fu {
    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void methodZi() {
        System.out.println("子类特有方法");
    }

    int num = 20;
    int age = 22;

    @Override
    public void showNum() {
        System.out.println(num);
    }
}
