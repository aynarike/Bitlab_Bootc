package String;

import java.util.Scanner;

public class s6_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String slovo = in.next();
        String bukva = in.next();
        int index = slovo.indexOf(bukva);
        if (-1==index){
            System.out.println("THERE IS NO SUCH LETTER");
        } else {
            System.out.println(index);
        }
    }
}