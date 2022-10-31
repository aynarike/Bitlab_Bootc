package _10_5_Lyambda_8_massiv;

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
        IntStream
                .range(0, n)
                .filter(i-> i%2!=0)
                .forEach(i-> System.out.print(arrayNumber.get(i) + " "));
    }
}