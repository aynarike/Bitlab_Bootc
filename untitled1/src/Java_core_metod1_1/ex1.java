package Java_core_metod1_1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(max(a, b, c));
    }
    public static int max (int a, int b, int c){
        if (a>b && a>c){
            return a;
        } else if (b>a && b>c) {
            return b;
        } else  {
            return c;
        }
    }
}