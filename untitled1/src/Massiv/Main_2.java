package Massiv;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main_2 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int numbLength = in.nextInt();
        int[] myArray = new int[numbLength];
        for (int i = 0; i< myArray.length; i++){
            myArray[i] = in.nextInt();
        }
        for (int i = 0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}
