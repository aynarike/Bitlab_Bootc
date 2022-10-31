package Massiv;

import java.util.Scanner;

public class Main_9 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] nums = new int[n];
        int pozitiv = 0;
        for (int i = 0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }

        for (int i = 0; i< nums.length; i++){ //спросить у Айбека как работает именно этот цикл
            if (nums[i]>0){
                pozitiv= pozitiv+1;
            }
        }
        System.out.print(pozitiv + " ");
    }
}