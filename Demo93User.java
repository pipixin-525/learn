package code010;

//公共父类
public class Demo93User {

    private String name;//姓名
    private int money;//余额，当前用户拥有的钱数

    public Demo93User() {
    }

    public Demo93User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //展示一下当前用户有多少钱
    public void show() {
        System.out.println("我叫：" + name + "，我还有" + money + "元钱");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
