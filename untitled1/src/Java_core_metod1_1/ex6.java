package Java_core_metod1_1;

import java.util.Scanner;

public class ex6 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String login = in.next();
        String password = in.next();
        System.out.println(Ainara(login, password));
    }
    public static String Ainara (String login, String password){
        if (login.equals("admin") && password.equals("qwerty")){
            return "Authentication completed";
        } else {
            return "Invalid login or password";
        }
    }
}