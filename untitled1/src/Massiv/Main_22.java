package Massiv;

import java.util.Scanner;

public class Main_22 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        for (int i = 0; i< nums.length; i++){
            if (nums[i]>max){
                max = nums[i];
            }
        }
        for (int j = 0; j< nums.length; j++){
            if (nums[j]<min){
                min = nums[j];
            }
        }
        System.out.println(max-min);
    }
}
