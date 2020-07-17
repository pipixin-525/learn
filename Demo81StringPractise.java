package code008;

/*
题目：
定义一个方法，把数组{1，2，3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
 */
public class Demo81StringPractise {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};

        String array3 = change(array1);
        System.out.println(array3);
    }

    public static String change(int[] arraay2) {
        String str = "[";
        for (int i = 0; i < arraay2.length; i++) {
            if (i == arraay2.length - 1) {
                str += "word" + arraay2[i] + "]";
            } else {
                str += "word" + arraay2[i] + "#";
            }
        }
        return str;
    }
}
