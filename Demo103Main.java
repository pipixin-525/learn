package code013;

public class Demo103Main {

    public static void main(String[] args) {
        Demo103Interface objA = new Demo103Interface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法！ 1-A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！ 2-A");
            }
        };
        objA.method1();
        objA.method2();

        System.out.println("====================");

        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new Demo103Interface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法！ 1-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！ 2-B");
            }
        }.method1();
        //因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的匿名对象
        new Demo103Interface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法！ 1-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！ 2-B");
            }
        }.method2();
    }
}
