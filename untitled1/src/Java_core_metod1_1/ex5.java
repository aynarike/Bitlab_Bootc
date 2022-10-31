package Java_core_metod1_1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String s1 = in.next().toLowerCase();
        String s2 = in.next().toLowerCase();
        System.out.println(Ainara(s1, s2));
    }
    public static String Ainara (String s1, String s2){
            if (s1.contains(s2)){
                return "YES";
            } else {
                return "NO";
            }
    }
}