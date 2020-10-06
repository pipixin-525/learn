package code016;
/*
按照斗地主规则，完成洗牌发牌的动作。
具体规则：
使用54张牌打乱顺序，三个玩家参与游戏，三个人交替摸牌，每人17张牌，最后三张留作底牌。
 */

import java.util.ArrayList;
import java.util.Collections;

public class Demo134DouDiZhu {
    public static void main(String[] args) {

        //1、准备牌
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个存储牌的花色，一个存储牌的序号
        String colors[] = {"♠", "♥", "♣", "♦"};
        String numbers[] = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //把大王和小王添加到poker集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套两个数组，组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
                //把组装好的牌遍历到poker集合中
                poker.add(color + number);
            }
        }
        System.out.println("洗牌前：" + poker);

        //2、洗牌
        //通过集合的工具类collections中的方法
        //static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换
        Collections.shuffle(poker);
        System.out.println("洗牌后：" + poker);

        //3、发牌
        //定义4个集合，存储玩家的牌和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        //遍历poker集合，获取每一张牌
        /*
           使用poker集合的索引%3给3个玩家轮流发牌
           剩余3张牌给底牌
        */
        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                diPai.add(poker.get(i));
            }
            switch (i % 3) {
                case 0:
                    player01.add(poker.get(i));
                    break;
                case 1:
                    player02.add(poker.get(i));
                    break;
                case 2:
                    player03.add(poker.get(i));
                    break;
            }
        }
        System.out.println("player01：" + player01);
        System.out.println("player02：" + player02);
        System.out.println("player03：" + player03);
        System.out.println("底牌：" + diPai);
    }
}
