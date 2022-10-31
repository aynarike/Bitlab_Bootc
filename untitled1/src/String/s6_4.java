package String;

import java.util.Scanner;

public class s6_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String slovo = in.next();
        String slovo1 = "java";
        if (slovo.equalsIgnoreCase(slovo1)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
