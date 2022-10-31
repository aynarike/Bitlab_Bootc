package String;

import java.util.Scanner;

public class s6_10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int sizeOFword = word.length();
        for (int i = 0; i<sizeOFword; i++){
            int endIndex = i+1;
            String dup = word.substring(i, endIndex);
            System.out.print(dup+dup);
        }
    }
}