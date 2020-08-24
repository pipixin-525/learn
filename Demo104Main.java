package code014;

public class Demo104Main {

    public static void main(String[] args) {
        Demo104Hero hero = new Demo104Hero();
        hero.setName("辛德拉");
        hero.setAge(22);

        Demo104Weapon weapon = new Demo104Weapon("暗黑法球");

        hero.setWeapon(weapon);

        hero.attack();
    }
}
