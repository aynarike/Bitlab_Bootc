package _8_1_Try_catch;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        User[] users = new User[5];
        int age = 0;

        for (int i = 0; i< users.length; i++){
            System.out.println((i+1)+ ". " + "Enter name: ");
            String name = in.next();
            System.out.println((i+1)+ ". " + "Enter surname: ");
            String surname = in.next();
            System.out.println((i+1)+ ". " + "Enter age: ");
            try {
                age = in.nextInt();
            } catch (Exception e) {
                age = 0;
                in.next();
            }
            User u1 = new User(name, surname, age);
            users[i] = u1;
//            users[i] = new User(name, surname, age); пр. как сокращенно написать код.
        }

        int sum = 0;
        for (int j = 0; j< users.length; j++){
            sum = sum + users[j].age;
        }
        System.out.println(sum/users.length);
        for (int k = 0; k< users.length; k++){
            System.out.println(users[k]);
        }
    }
}