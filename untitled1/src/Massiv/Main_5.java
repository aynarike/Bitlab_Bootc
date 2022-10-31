package Massiv;

import java.util.Scanner;

public class Main_5 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]numb = new int[n];
        for (int i = 0; i< numb.length; i ++){
            numb[i] = in.nextInt();
        }
        for (int i = 0; i< numb.length; i ++){
            if (numb[i]%2==0)
                System.out.print(numb[i] + " ");
        }
    }
}
