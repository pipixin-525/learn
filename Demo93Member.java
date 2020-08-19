package code010;

//成员类
import java.util.ArrayList;
import java.util.Random;

public class Demo93Member extends Demo93User {
    public Demo93Member() {
    }

    public Demo93Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {

        //从众多红包当中随便抽取一个，给我自己。
        //随机获取一个集合当中的索引编号。
        int index = new Random().nextInt(list.size());

        //根据索引，从集合当中删除，并且得到被删除的红包，给我自己。
        int delta = list.remove(index);

        //当前成员自己本来有多少钱。
        int money = super.getMoney();

        //加法，并且重新设置回去。
        super.setMoney(money + delta);
    }
}