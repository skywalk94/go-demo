package day06;

import java.util.Arrays;

public class day06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//      繁写  int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr)); //查看数组全部值

//        定义一个存50个字符串的数组
        String[] arr1 = new String[5];
        arr1[0] = "1"; // 动态初始化
        System.out.println(Arrays.toString(arr1));
    }
}
