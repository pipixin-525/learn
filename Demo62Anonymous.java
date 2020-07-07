package code007;

public class Demo62Anonymous {
    public static void main(String[] args) {
        Person per = new Person();

        per.name = "pipixin";
        per.showName();
        System.out.println("==========");

        //匿名对象
        new Person().name = "xxx";
        new Person().showName();//null
    }
}
