package day06;

import java.util.Arrays;
import java.util.Random;

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

//        求数组最大值
        int[] arr2 = {33, 5, 22, 44, 55};
        int max = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }
        System.out.println("最大值" + max);

//        数组翻转
        int[] arr3 = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr3.length - 1; i < j; i++, j--) {
            int temp = arr3[i];
            arr3[i] = arr3[j];
            arr3[j] = temp;
        }
        System.out.println("数组翻转" + Arrays.toString(arr3));

//        数组值随机变化
        int[] arr4 = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr4.length; i++) {
            int index = r.nextInt(arr4.length);
            int temp = arr4[i];
            arr4[i] = arr4[index];
            arr4[index] = temp;
        }
        System.out.println("数组随机" + Arrays.toString(arr4));

//        内存地址
        /*
         * 只要是new出来的一定是在堆里面开辟一个小空间
         * new了多次，在堆里面有多个小空间
         */
        /*
         * 方法在栈里面
         */
    }
}
