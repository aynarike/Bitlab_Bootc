package Topic3;

import java.util.Scanner;

public class Exp3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double count = 1;
        int i = 1;
        while (true){
            double d = in.nextDouble();
            if (d==0) break;

            count = count*d;
            i++;
        }
        System.out.println(count);
    }
}