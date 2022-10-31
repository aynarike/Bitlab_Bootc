package String;

import java.util.Scanner;

public class s6_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String slovo1 = in.next();
        String slovo2 = in.next();
        if (slovo1.equalsIgnoreCase(slovo2)){
            System.out.println("THEY ARE EQUAL");
        } else {
            System.out.println("THEY ARE NOT EQUAL");
        }
    }
}