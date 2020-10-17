package code019;

public class Demo159RegisterException extends Exception {
    //添加一个空参数的构造方法
    public Demo159RegisterException() {
        super();
    }

    //添加一个带异常信息的构造方法
    public Demo159RegisterException(String message) {
        super(message);
    }
}
