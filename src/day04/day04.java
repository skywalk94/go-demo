package day04;

public class day04 {
    public static void main(String[] args) {
        if (true) {
            System.out.println("真");
        } else {
            System.out.println("假");
        }

        int value = 3;
     /*   switch (value) {
            case 1:
                System.out.println("值为1");
                break;
            case 2:
                System.out.println("值为2");
                break;
            default:
                System.out.println("值为" + value);
                break;
        }*/

//        另一种switch写法
        switch (value) {
            case 1 -> {
                System.out.println("值为1");
            }
            case 2 -> System.out.println("值为2"); //只有一行可省略大括号
            default -> {
                System.out.println("值为" + value);
            }
        }

        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

//        纸张对折几次大于珠穆朗玛峰高度
        double height = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper < height) {
            paper *= 2;
            count++;
        }
        System.out.println(count);

//        判断数字是否为回文数
        int x = 121;
        int temp = x;
        int num = 0;
        while (x != 0) {
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println(num == temp);
    }
}
