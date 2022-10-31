package Massiv;

import java.util.Scanner;

public class Main_3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int numbLenght = in.nextInt();
        int [] myArray = new int[numbLenght];
        for (int i = 0; i<myArray.length; i++){
            myArray[i] = in.nextInt();
        }
        for (int i = 0; i<myArray.length; i++){
            System.out.println(i + " - " + myArray[i]);
        }
    }
}
