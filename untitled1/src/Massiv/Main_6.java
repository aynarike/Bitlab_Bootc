package Massiv;

import java.util.Scanner;

public class Main_6 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = in.nextInt();
        }
        for (int i = 0; i< nums.length; i ++){
            System.out.print(nums[i]*nums[i] + " ");
        }
    }
}
