package code009;

public class Demo89Extends {
    public static void main(String[] args) {

        //创建了一个子类对象
        Demo89Teacher teacher = new Demo89Teacher();
        //继承了来自父类的method方法
        teacher.method();

        //创建另一个子类助教的对象
        Demo89Assistant assistant = new Demo89Assistant();
        //继承了来自父类的method方法
        assistant.method();
        System.out.println("==========");

        Demo89Employee emp = new Demo89Employee();
        System.out.println(emp.numFu);
        System.out.println("==========");

        System.out.println(teacher.numFu);
        System.out.println(teacher.numZi);
        System.out.println("==========");

        System.out.println(teacher.num);
        System.out.println("==========");

        teacher.methodZi();
        teacher.methodFu();
        System.out.println("==========");

        assistant.method();
    }
}
