package String;

import java.util.Scanner;

public class s6_11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next().toLowerCase();
        String letter = in.next().toLowerCase();
        char[] arr = word.toCharArray();
        int count = 0;

        for (int i = 0; i<arr.length; i++){
            String perevod  = String.valueOf(arr[i]); //мы переводим эл.массива в стринг для сравнения с буквой
            if (perevod.equals(letter)){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
//затем подсчитать сколько раз буква встречается в тексте.