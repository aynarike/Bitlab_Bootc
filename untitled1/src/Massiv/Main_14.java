package Massiv;

import javax.swing.text.Style;
import java.util.Scanner;

public class Main_14 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numb = new int[n];
        int sum = 0;
        double average = 0;
        for (int i = 0; i< numb.length; i++){
            numb[i] = in.nextInt();
        }
        for (int i = 0; i< numb.length; i++){
            sum = sum + numb[i];
        }
        for (int i = 0; i< numb.length; i++){
            average = sum/n;
            if (average<numb[i]){
                System.out.print(numb[i] + " ");
            }
        }
    }
}