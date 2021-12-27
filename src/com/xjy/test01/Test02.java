package com.xjy.test01;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int[] nums = {88,34,21,4,9,10,12,28,6};
//        bubbleSort(nums);
        System.out.println(test01(100000));
        System.out.println(test02(100000));
    }

    public static void bubbleSort(int[] nums){
        int n = nums.length;
        int lastSwapIndex = 0;
        int arrayBoundary = n-1;
        for (int i = 0;i < n-1;i++){
            boolean flag = true;
            for (int j = 0;j < arrayBoundary;j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    flag = false;
                    lastSwapIndex = j;
                }
            }
            arrayBoundary = lastSwapIndex + 1;
            if (flag){
                break;
            }
            System.out.println("第"+(i+1)+"趟排序"+Arrays.toString(nums));
        }
        System.out.println(Arrays.toString(nums));
    }

    public static int test01(int num){
        int sum = 0;
        for (int i = 1;i <= num;i++){
            sum += i;
        }
        return sum;
    }

    public static int test02(int num){
        if (num == 0||num == 1){
            return num;
        }
        return test02(num-1)+num;
    }

}
