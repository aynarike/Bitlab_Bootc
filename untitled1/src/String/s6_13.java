package String;

import java.util.Scanner;

public class s6_13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        char[] arr = word.toCharArray();
        for (int i = arr.length -1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}