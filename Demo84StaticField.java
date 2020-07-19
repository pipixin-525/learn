package code009;


public class Demo84StaticField {
    public static void main(String[] args) {
        Demo83Student one = new Demo83Student("张三", 20);
        one.room = "101教室";
        System.out.println("姓名：" + one.getName() + "，年龄："
                + one.getAge() + "，班级：" + one.room + "，学号：" + one.getId());

        Demo83Student two = new Demo83Student("李四", 21);
        System.out.println("姓名：" + two.getName() + "，年龄："
                + two.getAge() + "，班级：" + two.room + "，学号：" + two.getId());

        Demo83Student three = new Demo83Student("王五", 19);
        System.out.println("姓名：" + three.getName() + "，年龄："
                + three.getAge() + "，班级：" + three.room + "，学号：" + three.getId());
    }
}
