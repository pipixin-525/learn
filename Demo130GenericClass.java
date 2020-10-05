package code016;

public class Demo130GenericClass {
    public static void main(String[] args) {

        Demo130Generic gen1 = new Demo130Generic();
        gen1.setName("123");
        Object name1 = gen1.getName();
        System.out.println("Obj:" + name1);

        Demo130Generic<String> gen2 = new Demo130Generic<>();
        gen2.setName("123");
        String name2 = gen2.getName();
        System.out.println("String:" + name2);

        Demo130Generic<Integer> gen3 = new Demo130Generic<>();
        gen3.setName(123);
        int name3 = gen3.getName();//自动拆箱
        System.out.println("int:" + name3);
    }
}
