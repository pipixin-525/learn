package code006;
//import code006.Demo51Person;
public class Demo52PrintPerson {
    public static void main(String[] args) {
        Demo51Person one = new Demo51Person();
        one.show();

        one.name = "xx";
        one.setAge(20);
        one.show();
    }
}
