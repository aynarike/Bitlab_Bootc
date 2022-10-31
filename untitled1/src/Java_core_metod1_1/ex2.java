package Java_core_metod1_1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(triangle(a, b, c));
    }
    public static String triangle (int a, int b, int c){
        if (a+b>c && b+c>a && a+c>b){
            return "YES";
        } else  {
            return "NO";
        }
    }
}