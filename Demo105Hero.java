package code014;

public class Demo105Hero {

    private String name;
    private Demo105Skill skill;

    public Demo105Hero() {
    }

    public Demo105Hero(String name, Demo105Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void attack() {
        System.out.println("我叫：" + name + "，施放技能：");
        skill.use();
        System.out.println("技能施放完毕！");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Demo105Skill getSkill() {
        return skill;
    }

    public void setSkill(Demo105Skill skill) {
        this.skill = skill;
    }
}
