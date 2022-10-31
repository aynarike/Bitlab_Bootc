package _10_3_Lyambda_6_massiv;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList <Integer> arrayNumber = new ArrayList<Integer>();

        for (int i = 0; i<n; i++){
            arrayNumber.add(in.nextInt());
        }
        arrayNumber.stream()
                .forEach(Integer-> System.out.print(Integer*Integer + " "));
    }
}