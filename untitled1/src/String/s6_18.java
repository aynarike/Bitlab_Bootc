package String;

import java.util.Scanner;

public class s6_18 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String s1 = in.next().toLowerCase();
        String s2 = "";

        for (int i = s1.length() - 1; i>=0; i--){
            s2 = s2 + s1.charAt(i);
        }
        if (s1.equals(s2)){
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}