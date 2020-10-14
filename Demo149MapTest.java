package code018;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
    计算一个字符串中每一个字符出现的次数
 */
public class Demo149MapTest {
    public static void main(String[] args) {

        //使用Scanner获取用户输入的字符串
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println("请输入一个字符串");

        //创建Map集合，key是字符串中的字符，value是字符的个数
        HashMap<Character, Integer> map = new HashMap<>();

        //遍历字符串，获取每一个字符
        /*
            使用获取到的字符，去Map集合中判断key是否存在
            key存在：
                通过字符key，获取value（字符个数）
                value++
                put(key，value)把新的value储存到Map集合中
            key不存在：
                put(key，1)
        */
        char[] chars = s1.toCharArray();
        for (char c1 : chars) {
            if (map.containsKey(c1)) {
                Integer n1 = map.get(c1);
                n1++;
                map.put(c1, n1);
            } else {
                map.put(c1, 1);
            }
        }
        //遍历Map集合
        Set<Character> set = map.keySet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            Character next = it.next();
            System.out.println(next + "一共出现了：" + map.get(next) + "次");
        }
    }
}
