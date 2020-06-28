package code006;

//import code006.Demo53Student;
public class Demo54UseStudent {
    public static void main(String[] args) {
        Demo53Student stu = new Demo53Student();

        stu.setName("pipixin");
        stu.setAge(21);
        stu.setGender(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是否为男性：" + stu.isGender());
    }
}
