package String;

import java.util.Scanner;

public class s6_17 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        String s3 = "";
        for (int i = s2.length() - 1; i>=0; i--){
            s3 = s3 + s2.charAt(i);
                }
        if (s1.equals(s3)){
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}