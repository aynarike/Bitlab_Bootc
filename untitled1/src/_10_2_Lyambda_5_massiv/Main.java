package _10_2_Lyambda_5_massiv;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList <Integer> arrayNumbers = new ArrayList<Integer>();

        for (int i = 0; i<n; i++){
            arrayNumbers.add(in.nextInt());
        }
        arrayNumbers.stream()
                .filter(Integer-> Integer%2==0)
                .forEach(Integer-> System.out.print(Integer + " "));
    }
}