package com.xjy.test01;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("欢迎使用简单计算器系统！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double firstNum = scanner.nextDouble();
        System.out.println("请输入运算符：");
        String operator = scanner.next();
        System.out.println("请输入第二个数字：");
        double secondNum = scanner.nextDouble();
        boolean flag = true;
        while (flag) {

            switch (operator) {
                case "+":
                    System.out.println(firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
                    flag = false;
                    break;
                case "-":
                    System.out.println(firstNum + "-" + secondNum + "=" + (firstNum - secondNum));
                    flag = false;
                    break;
                case "*":
                    System.out.println(firstNum + "*" + secondNum + "=" + (firstNum * secondNum));
                    flag = false;
                    break;
                case "/":
                    System.out.println(firstNum + "/" + secondNum + "=" + (firstNum / secondNum));
                    flag = false;
                    break;
                case "%":
                    System.out.println(firstNum + "%" + secondNum + "=" + (firstNum % secondNum));
                    flag = false;
                    break;
                default:
                    System.out.println("运算符有误。。。");
                    System.out.println("请重新输入运算符：");
                    operator = scanner.next();
            }
        }
    }
}
