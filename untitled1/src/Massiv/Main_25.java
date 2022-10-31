package Massiv;

import java.util.Scanner;

public class Main_25 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        double sum = 0;
        double count = 0;
        for (int i = 0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int m = in.nextInt();
        for (int j = 0; j< nums.length; j++){
            if (nums[j]>m) {
                sum = sum + nums[j];
                count = count + 1;
            }
        }
        System.out.println(sum/count);
    }
}