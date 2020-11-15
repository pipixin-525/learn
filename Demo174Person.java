package code021;

public class Demo174Person {
    private String name;
    private int age;

    public Demo174Person() {
    }

    public Demo174Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Demo174Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
