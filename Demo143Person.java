package code017;

public class Demo143Person implements Comparable<Demo143Person> {

    private String name;
    private int age;

    public Demo143Person() {
    }

    public Demo143Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo143Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    //重写排序的规则
    @Override
    public int compareTo(Demo143Person per) {
        //return 0;//认为元素都是相同的
        //自定义比较的规则，比较两个人的年龄
        //return this.getAge() - per.getAge();//按照年龄升序排序
        return per.getAge() - this.getAge();//按照年龄降序排序
    }
}
