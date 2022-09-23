package day05;

import java.util.Random;

public class day05 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
//                结束循环，循环下个循环
                continue;
            }
            System.out.println(i);
        }

        for (int i = 1; i < 5; i++) {
            if (i == 3) {
//                结束整个循环
                break;
            }
            System.out.println(i);
        }
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println("随机数" + num);
    }
}
