package code013;

public class Demo100InnerClass {

    public static void main(String[] args) {
        Demo100Body body = new Demo100Body();//外部类的对象
        //通过外部类的对象，调用外部类的方法，里面间接再使用内部类Heat
        body.methodBody();
        System.out.println("==========");

        //直接调用
        Demo100Body.Heart heart = new Demo100Body().new Heart();
        heart.beat();
    }
}
