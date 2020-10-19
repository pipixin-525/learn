package code020;

public class Demo160Person {
    private String name;

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(name + "--->" + i);
        }
    }

    public Demo160Person() {
    }

    public Demo160Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
