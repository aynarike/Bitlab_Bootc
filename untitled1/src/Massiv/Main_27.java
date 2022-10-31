package Massiv;
import java.util.Scanner;

public class Main_27 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numb = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i< numb.length; i ++){
            numb[i] = in.nextInt();
        }
        for (int i = 0; i< numb.length; i++){
            if (numb[i]>max){
                max = numb[i];
                indexMax = i;
            }
        }
        for (int i = 0; i< numb.length; i++){
            if (numb[i]<min){
                min = numb[i];
                indexMin = i;
            }
        }
            numb[indexMax] = min;
            numb[indexMin] = max;

        for (int i = 0; i< numb.length; i++){
            System.out.print(numb[i] + " ");
        }
    }
}