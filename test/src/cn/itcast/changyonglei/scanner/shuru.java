package cn.itcast.changyonglei.scanner;

import java.util.Scanner;

public class shuru {
    public static void main(String[] args) {

        /*Scanner类
        比较常用的简单的成员方法:
        (1)hasNextXxx();获取录入项是否是xxx类型,如果是字符串的,xxx可以省略.
        (2)nextXxx();获取下一个录入项.Xxx是数据类型.
        (3)nextLine();获取输入的一行数据*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个整数");
        boolean b = scanner.hasNextInt();
        if (b){
            int i = scanner.nextInt();
            System.out.println(i);
        }
        System.out.println("输入一个字符串");
        String s = scanner.next();
        System.out.println(s);
    }
}
