package com.xjy.test01;

public class Test03 {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 100; i+=2){
//            sum += i;
//        }
//        System.out.println(sum);
//        bubbleSort(new int[]{35,88,12,5,95,26,111,57});
        testCase01();
    }

    public static void bubbleSort(int[] nums){
        for (int i = 0;i < nums.length-1;i++){
            for (int j = 0;j < nums.length-1-i;j++){
                if (nums[j] > nums[j+1]){
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        for (int i = 0;i < nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    // 九九乘法表
    public static void testCase01(){
        for (int i = 1;i <= 9;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(j + "*" + i + "=" + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}
