
package Java_core_metod1_1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String word = in.next().toLowerCase();
        String letter = in.next().toLowerCase();
        System.out.println(Ainara(word, letter));
    }
    public static int Ainara (String word, String letter){
        int count = 0;
        for (int i = 0; i<word.length(); i++){
            if (letter.contains(Character.toString(word.charAt(i)))){
                count = count + 1;
            }
        }
        return count;
    }
}