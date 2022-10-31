package Massiv;

import java.util.Scanner;

public class Main_12 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] numb = new int[n];
        int sum = 0;
        int count = 0;
        for (int i = 0; i< numb.length; i++){
            numb[i] = in.nextInt();
        }
        for (int i = 0; i< numb.length; i++){
            if (numb[i]%2==0){
                sum = sum+numb[i];
                count = count + 1;
            }
        }
        System.out.println(sum/count);
    }
}