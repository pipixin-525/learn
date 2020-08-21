package code013;

public class Demo100Body {//内部类

    public class Heart {//成员内部类

        //内部类的方法
        public void beat() {
            System.out.println("我叫：" + name);
            System.out.println("心脏跳动：扑通扑通！");

        }
    }

    //外部类的成员变量
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //外部类的方法
    public void methodBody() {
        System.out.println("外部类的方法");
        new Heart().beat();
    }
}
