package String;

import java.util.Scanner;

public class s6_9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String slovo = in.next();
        for (int i = 0; i<slovo.length(); i++){
            System.out.println(slovo.charAt(i));
        }
    }
}