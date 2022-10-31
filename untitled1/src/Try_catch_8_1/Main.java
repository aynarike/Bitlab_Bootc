package Try_catch_8_1;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        User [] users = new User[5];
        int age = 0;
        int sum = 0;
        for (int i = 0; i< users.length; i++){
            System.out.println((i+1) + ". " + "Enter name: ");
            String name = in.next();
            System.out.println((i+1) + ". " + "Enter surname: ");
            String surname = in.next();
            System.out.println((i+1) + ". " + "Enter age: ");
            try {
                age = Integer.parseInt(in.next());
            } catch (Exception e){
                age = 0;
                e.printStackTrace();
            }
            User Ainara = new User(name, surname, age);
            users [i] = Ainara;
        }
        for (int i = 0; i<users.length; i++){
            sum = sum + users[i].age;
        }
        System.out.println(sum/5);
    }
}