package code021;

public class Demo173InvokeCook {
    public static void main(String[] args) {
        invokeCook(() -> {
            System.out.println("吃饭啦");
        });

        //优化省略
        invokeCook(() -> System.out.println("吃饭啦"));
    }

    public static void invokeCook(Demo173Cook cook) {
        cook.makeFood();
    }
}
