package String;

import java.util.Scanner;

public class s6_12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        word = word.replace('a', 'o');
        System.out.println(word);
    }
}
//      System.out.print("Возвращаемое значение: " );
//      System.out.println(Str.replace('s', 'b'));
//
//      System.out.print("Возвращаемое значение: " );
//      System.out.println(Str.replace('о', 'а'));




//char[] arr = word.toCharArray();
//String letter = "a";

//for (int i = 0; i<arr.length; i++){
//String perevod  = String.valueOf(arr[i]);
//if (perevod.equals(letter)){
//letter = "o";
//}
//}
