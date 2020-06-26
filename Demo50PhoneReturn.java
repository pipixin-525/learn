package code006;
//import code006.Demo48Phone;
public class Demo50PhoneReturn {
    public static void main(String[] args) {
        Demo48Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static Demo48Phone getPhone(){
        Demo48Phone one = new Demo48Phone();
        one.brand = "oneplus";
        one.price = 5555.5;
        one.color = "black";
        return one;
    }
}
