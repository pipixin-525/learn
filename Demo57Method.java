package code007;

public class Demo57Method {
    //成员变量
    private String name;
    private int age;

    //无参构造方法
    public Demo57Method() {
        System.out.println("无参构造方法执行了");
    }

    //有参构造方法
    public Demo57Method(String name, int age) {
        System.out.println("有参构造方法执行了");
        this.name = name;
        this.age = age;
    }

    //get、set方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
