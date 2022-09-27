package day09;

public class day09 {
    public static void main(String[] args) {
// 字符串比较
        String s1 = new String("abc");
        String s2 = "abc";
        /*
         * ==号比较
         * 基本数据类型：比的是数据值
         * 引用数据类型：比的是地址值
         * */
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.length());
    }
}
