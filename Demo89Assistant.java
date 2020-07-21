package code009;

//定义了员工的另一个子类：助教
public class Demo89Assistant extends Demo89Employee {
    int num = 20;

    public void method() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
