package code014;

public class Demo105Game {

    public static void main(String[] args) {

        Demo105Hero hero = new Demo105Hero();
        hero.setName("艾希");

        //使用单独定义的实现类
//        hero.setSkill(new Demo105SkillImpl());


        //使用匿名内部类
//        Demo105Skill skill = new Demo105Skill() {
//            @Override
//            public void use() {
//                System.out.println("哔哔哔");
//            }
//        };
//        hero.setSkill(skill);


        //使用匿名内部类和匿名对象
        hero.setSkill(new Demo105Skill() {
            @Override
            public void use() {
                System.out.println("突突突");
            }
        });


        hero.attack();
    }
}
