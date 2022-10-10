package day10;

import java.util.ArrayList;

public class day10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
//        根据值删除
        list.remove("1");
        System.out.println(list);
//        根据索引删除
        list.remove(0);
        System.out.println(list);

//        根据索引修改元素
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.set(0, "2");
        System.out.println(list1);

//        根据索引查询元素
        System.out.println(list1.get(0));

//        查询集合长度
        System.out.println(list1.size());
    }
}
