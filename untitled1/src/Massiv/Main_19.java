package Massiv;

import java.util.Scanner;

public class Main_19 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numb = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i< numb.length; i++){
            numb[i] = in.nextInt();
        }
        for (int i = 0; i < numb.length; i++){
            if (numb[i]<min){
                min=numb[i];
            }
        }
        System.out.println(min*min);
    }
}