package Massiv;

import java.util.Scanner;

public class Main_11 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] nums = new int[n];
        double sum = 0;
        for (int i = 0; i<nums.length; i++){
            nums[i] = in.nextInt();
        }
        for (int i = 0; i<nums.length; i ++){
            sum = sum + nums[i];
        }
        System.out.println((int)sum + " " + sum/n);
    }
}