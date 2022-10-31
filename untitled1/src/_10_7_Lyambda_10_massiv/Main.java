package _10_7_Lyambda_10_massiv;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> arrayNumber = new ArrayList<Integer>();
        for (int i = 0; i<n; i++){
            arrayNumber.add(in.nextInt());
        }
        int sum = arrayNumber.stream().reduce(0, (a, b)->a+b);
        System.out.println(sum);
    }
}

//int sum = arrayNumber.stream().mapToInt((x) -> (x)).sum();