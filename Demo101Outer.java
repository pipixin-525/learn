package code013;

public class Demo101Outer {
    //外部类的成员变量
    int num = 10;

    public class Inner{
        //内部类的成员变量
        int num = 20;

        public void methodInner(){
           //内部类成员方法的局部变量
            int num = 30;

            System.out.println("调用局部变量：" + num);
            System.out.println("调用内部类的成员变量：" + this.num);
            System.out.println("调用外部类的成员变量：" + Demo101Outer.this.num);
        }
    }

}
