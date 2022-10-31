package Massiv;

import java.util.Scanner;

public class Main_24 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int index = 0;
        for ( int i = 0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }
        int m = in.nextInt();
        boolean condition = false;
        for (int i = 0; i< nums.length; i++){
            if (m==nums[i]){
                index = i;
                condition = true;
            }
        }
        if (condition == true){
            System.out.print("YES" + "\n" + index);
        }else {
            System.out.println("NO");
        }
    }
}