package day09;

import java.util.StringJoiner;

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

        String phone = "13512345678";
        System.out.println(phone.substring(0, 3) + "****" + phone.substring(7));

//        string容器
        StringBuilder sb = new StringBuilder();
        sb.append(123);
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.length());

//        StringBuilder转String
        System.out.println(sb.toString());

        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("aaa").add("bbb");
        System.out.println(sj);
    }
}
