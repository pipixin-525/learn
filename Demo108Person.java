package code015;

import java.util.Objects;

public class Demo108Person {

    private String name;
    private int age;

    public Demo108Person() {
    }

    public Demo108Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass() 相当于obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Demo108Person that = (Demo108Person) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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
}
