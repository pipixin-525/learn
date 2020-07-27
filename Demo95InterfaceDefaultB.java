package code011;

public class Demo95InterfaceDefaultB implements Demo95InterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法B");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现了类B 覆盖重写了接口默认方法");
    }
}