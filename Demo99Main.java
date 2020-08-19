package code012;

public class Demo99Main {

    public static void main(String[] args) {
        Demo99Computer computer = new Demo99Computer();
        computer.powerOn();

        //Demo99Mouse mouse = new Demo99Mouse();
        //使用多态写法
        Demo99USB usbMouse = new Demo99Mouse();
        computer.useDevice(usbMouse);

        //没有使用多态写法
        Demo99Keyboard keyboard =new Demo99Keyboard();
        //方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard);//正确写法，发生了向上转型
        //computer.useDevice(new Demo99Keyboard());//也是正确的

        computer.powerOff();
    }
}
