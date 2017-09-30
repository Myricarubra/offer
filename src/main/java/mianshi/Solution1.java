package mianshi;

/**
 * Created by zhangdong on 2017/9/30.
 */

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution1 {
    public static String replaceSpace(StringBuffer str) {
        if (str != null) {
            String newStr = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    newStr = newStr + "%20";
                } else {
                    newStr = newStr + str.charAt(i);
                }
            }
            System.out.println(newStr);
            return newStr;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        replaceSpace(new StringBuffer("we are so happy !"));
    }
}