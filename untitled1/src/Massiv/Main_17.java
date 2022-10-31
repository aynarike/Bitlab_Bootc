package Massiv;

import java.util.Scanner;

public class Main_17 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int sum = 1;
        for (int i = 0; i<nums.length; i++){
            nums[i] = in.nextInt();
        }
        for (int i = 0; i< nums.length; i++){
            if(nums[i]>0 && i%2==0){
                sum = sum*nums[i];
            }
        }
        System.out.println(sum);
    }
}