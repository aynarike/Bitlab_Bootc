package Massiv;

import java.util.Scanner;

public class Main_23 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numb = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;
        //int average = 0;
        for (int i = 0; i< numb.length; i++){
            numb[i] = in.nextInt();
        }
        for (int i = 0; i<numb.length; i++){
            if (numb[i]<min){
                min = numb[i];
            }
        }
        for (int i = 0; i<numb.length; i++){
            if (numb[i]>max){
                max = numb[i];
            }
        }
        for (int j = 0; j< numb.length; j++){
            if (numb[j]!=min && numb[j]!= max){
                sum = sum + numb[j];
                count = count + 1;
            }
        }
        System.out.print(sum + "\n" + (double)sum/count);
    }
}