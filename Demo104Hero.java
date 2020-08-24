package code014;

public class Demo104Hero {

    private String name;
    private int age;
    private Demo104Weapon weapon;

    public Demo104Hero() {
    }

    public Demo104Hero(String name, int age, Demo104Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public void attack() {
        System.out.println("年龄为" + age + "岁的" + name + "使用" + weapon.getWeapon() + "来攻击敌人");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Demo104Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Demo104Weapon weapon) {
        this.weapon = weapon;
    }
}
