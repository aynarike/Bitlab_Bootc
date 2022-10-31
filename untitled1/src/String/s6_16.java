package String;

import java.util.Scanner;

public class s6_16 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next().toLowerCase();
        int digitCount = 0;
        for (int i = 0; i<word.length(); i++){
            if (Character.isDigit(word.charAt(i))){
                digitCount = digitCount + Integer.parseInt(String.valueOf(word.charAt(i)));
            }
        }
        System.out.println(digitCount);
    }
}




//    String str = "007-034456-0076";

//    String[] parts = str.split("-");
//    for (String x : parts)
//      System.out.println(x);