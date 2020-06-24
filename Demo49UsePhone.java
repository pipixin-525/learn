package code006;
//import code006.Demo48Phone;
public class Demo49UsePhone {
    public static void main(String[] args) {
        Demo48Phone ph = new Demo48Phone();

        System.out.println(ph.brand);//null
        System.out.println(ph.color);//null
        System.out.println(ph.price);//0.0
        System.out.println("==========");

        ph.brand = "小米";
        ph.color = "黑色";
        ph.price = 2599;
        System.out.println(ph.brand);
        System.out.println(ph.color);
        System.out.println(ph.price);
        System.out.println("==========");

        ph.call("xxx");
        ph.sendMessage();
    }
}
