package Topic1;

import java.util.Scanner;

public class Exp_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println((int)((x%10) + (x/100) + ((x/10)%10)));
    }
}
// Н//