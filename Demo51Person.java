package code006;

public class Demo51Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我叫：" + name + "，今年" + age);
    }

    //这个成员方法专门用于向age设置数据
    public void setAge(int num){
        if(num < 100 && num >= 0){
            age = num;
        }else{
            System.out.println("数据不合理！");
        }
    }

    //这个成员方法专门用于获取age数据
    public int getAge(){
        return age;
    }
}
