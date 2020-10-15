package code018;
/*
    按照斗地主规则，完成洗牌发牌的动作。
    具体规则：
    使用54张牌打乱顺序，三个玩家参与游戏，三个人交替摸牌，每人17张牌，最后三张留作底牌，并使牌的顺序从大到小排列。
*/

import java.util.*;

public class Demo151DouDiZhu {
    public static void main(String[] args) {

        //准备牌
        //创建一个Map集合，储存牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个list集合，储存牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //准备两个集合一个存储花色，一个存储大小
        List<String> colors = List.of("♥", "♠", "♦", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //把大王，小王放到Map集合中
        poker.put(0, "大王");
        poker.put(1, "小王");

        //循环嵌套两个集合组装牌
        int i1 = 2;
        for (String number1 : numbers) {
            for (String color : colors) {
                //System.out.println(number + color);
                //将组装好的牌放到Map集合中
                poker.put(i1++, number1 + color);
            }
        }
        //System.out.println(poker);

        //遍历Map集合的键，将其放到list集合中
        Set<Integer> set = poker.keySet();
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            pokerIndex.add(it.next());
        }

        //打乱顺序
        Collections.shuffle(pokerIndex);

        //准备三个玩家和底牌的集合
        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        List<Integer> player3 = new ArrayList<>();
        List<Integer> diPai = new ArrayList<>();

        //发牌
        //并给玩家牌排序
        for (int i2 = 0; i2 < pokerIndex.size(); i2++) {
            if (i2 >= 51) {
                diPai.add(pokerIndex.get(i2));
                Collections.sort(diPai);
            } else {
                switch (i2 % 3) {
                    case 0:
                        player1.add(pokerIndex.get(i2));
                        Collections.sort(player1);
                        break;
                    case 1:
                        player2.add(pokerIndex.get(i2));
                        Collections.sort(player2);
                        break;
                    case 2:
                        player3.add(pokerIndex.get(i2));
                        Collections.sort(player3);
                        break;
                }
            }
        }

        //调用看牌的方法
        look("玩家1：", player1, poker);
        look("玩家2：", player2, poker);
        look("玩家3：", player3, poker);
        look("底牌：", diPai, poker);
    }

    //关于看牌的方法，根据key找value
    public static void look(String name, List<Integer> list, HashMap<Integer, String> poker) {
        System.out.println(name);
        for (Integer i3 : list) {
            System.out.print(poker.get(i3) + " ");
        }
        System.out.println();
    }
}
