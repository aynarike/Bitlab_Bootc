package Java_core_metod1_1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String word = in.next().toLowerCase();
        System.out.println(Ainara(word));
    }
    public static String Ainara (String word){
        String word2 = "";
        for (int i = word.length() - 1; i>=0; i--){
             word2 =  word2 + Character.toString(word.charAt(i));
        }
            if (word.equals(word2)){
                return "YES";
            } else {
                return "NO";
            }
    }
}