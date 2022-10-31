package String;

import java.util.Scanner;

public class s6_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String slovo = in.next();
        String slovo1 = "BITLAB";
        if (slovo.equals(slovo1)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}



//Принимайте с консоли некий текст и сравните его со словом "BITLAB".
// Если они абсолютно идентичны, выведите на экран "YES", иначе "NO".