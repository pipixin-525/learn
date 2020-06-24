package code006;
//import code006.Demo46Student;// 同一包中可省略不写
public class Demo47UseStudent {
    public static void main(String[] args) {
        Demo46Student stu = new Demo46Student();

        System.out.println(stu.name);//null
        System.out.println(stu.age);//0
        System.out.println("==========");

        stu.name = "xxx";
        stu.age  = 20;
        System.out.println(stu.name);//xxx
        System.out.println(stu.age);//20
        System.out.println("==========");

        stu.eat();
        stu.sleep();
        stu.study();
    }

}
