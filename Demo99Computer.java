package code012;

public class Demo99Computer {

    public void powerOn() {
        System.out.println("电脑开机");
    }

    public void powerOff() {
        System.out.println("电脑关机");
    }

    public void useDevice(Demo99USB usb) {
        usb.open();

        if (usb instanceof Demo99Mouse) {
            Demo99Mouse mouse = (Demo99Mouse) usb;
            mouse.click();
        } else if (usb instanceof Demo99Keyboard) {
            Demo99Keyboard keyboard = (Demo99Keyboard) usb;
            keyboard.type();
        }

        usb.close();
    }

}
