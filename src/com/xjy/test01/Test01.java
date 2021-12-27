package com.xjy.test01;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
//        testCase1();
//        testCase2();
        int a = 10;
        int[] nums = {19,5,2,11,8,4,33};
//        testCase3(nums);
//        testCase4(4);
//        testCase5();
        bubbleSort(nums);
    }

    public static void testCase1(){
        Scanner s  = new Scanner(System.in);
        System.out.print("Please input score:");
        double score = s.nextDouble();
        if (score > 100 || score < 0) {
            System.out.print("This score is illegal");
            return;
        }
        char grade = 'E';
        if (score >= 90){
            grade = 'A';
        }else if (score >= 80){
            grade = 'B';
        }else if (score >= 70){
            grade = 'C';
        }else if (score >= 60){
            grade = 'D';
        }
        System.out.println("This student's grade is:"+grade);
    }

    public static void testCase2(){
        for (int i = 1;i <= 10;i += 2){
            System.out.println(i);
        }

        for (int i = 1;i <= 10;i++){
            if (i%2 != 0) System.out.println(i);
        }
    }

    public static void testCase3(int[] nums){
        for (int i = 0;i < 2;i++){
            for (int j = 0;j < nums.length - 1 - i;j++){
                if (nums[j] > nums[j+1]){
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        System.out.println("最大元素："+nums[nums.length-1]);
        System.out.println("第二大元素："+nums[nums.length-2]);
    }

    /**
     * 打印等腰三角形
     * @param n:等腰三角形所占的行数
     */
    public static void testCase4(int n){
        //遍历，一行一行打印，每行由若干空格和*组成
        for(int i = 0;i < n;i++){
            //打印空格
            //当前行空格数量其实是（总行数n-当前行数），因为这里第几行i是从0开始的，所以空格数量n - i - 1
            for (int j = n - i - 1;j>=0;j--){
                System.out.print(" ");
            }

            //打印*
            //*数量与当前行的关系：2*(i+1)-1
            for(int m = 0;m < 2*(i+1)-1;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void testCase5(){
        for (int i = 1;i <= 9;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }

    public static void bubbleSort(int[] nums){
        int n = nums.length;
        /*
        for (int i = 0;i < n-1;i++){
            for (int j = 0;j < n-1-i;j++){
                if (nums[j] > nums[j+1]){
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
         */

        int lastSwapIndex = 0;
        int arrayBoundary = n-1;
        for (int i = 0;i < n-1;i++){
            boolean flag = true;
            for (int j = 0;j < arrayBoundary;j++){
                if (nums[j] > nums[j+1]){
                    nums[j] = nums[j]^nums[j+1];
                    nums[j+1] = nums[j]^nums[j+1];
                    nums[j] = nums[j]^nums[j+1];
                    flag = false;
                    lastSwapIndex = j;
                }
            }
            arrayBoundary = lastSwapIndex + 1;
            if (flag){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
