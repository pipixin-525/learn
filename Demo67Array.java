package code008;

public class Demo67Array {
    public static void main(String[] args) {
        StandardPerson[] array = new StandardPerson[3];

        StandardPerson one = new StandardPerson("AAA",15);
        StandardPerson two = new StandardPerson("BBB",20);
        StandardPerson three = new StandardPerson("CCC",25);

        //将one当中的地址值复制到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());
    }
}
