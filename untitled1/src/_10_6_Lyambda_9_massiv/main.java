package _10_6_Lyambda_9_massiv;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList <Integer> arrayNumber = new ArrayList<Integer>();

        for (int i = 0; i<n; i++){
            arrayNumber.add(in.nextInt());
        }
        long x = arrayNumber.stream()
                .filter(Integer-> Integer>0)
                .count();
        System.out.println(x);
    }
}
