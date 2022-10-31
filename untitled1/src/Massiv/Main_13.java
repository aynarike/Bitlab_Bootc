package Massiv;

import java.util.Scanner;

public class Main_13 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        double count = 0;
        double average = 0;
        for(int i = 0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        for (int i = 0; i< nums.length; i++){
            if (nums[i]<0){
                sum = sum + nums [i];
                count = count + 1;
                average = sum/count;
            }
        }
        System.out.println(average);
    }
}
