package day03;

public class day03 {
    public static void main(String[] args) {
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);

//        隐式类型转换 从小到大
//        类型范围 byte<short<int<long<float<double
//        byte、short、char计算会转换为int类型
//        不同类型计算最终输出最大取值范围的类型

//        强制类型转换 从大到小
//        只需要添加（转换类型）
        double num = 123.1;
        int num1 = (int) num;
        System.out.println(num1);

//        逻辑运输
        System.out.println(true & true);
        System.out.println(true | false);
        System.out.println(true ^ false);
        System.out.println(!false);

//        短路逻辑运算符
//        &&当第一个表达式为true时，才会执行后面
//        &全都会执行
        System.out.println(true && true);
    }
}
