package _2_5_classes_objects_example;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        Student[] listStudents = new Student[100];
        int i = 0;
        while (true) {

            System.out.println("""
                    PRESS [1] TO ADD STUDENT
                    PRESS [2] TO LIST STUDENT
                                     
                    PRESS [0] TO EXIT""");
            int comand = in.nextInt();
            if (comand == 1) {
                System.out.println("Insert name: ");
                String name = in.next();
                System.out.println("Insert surname: ");
                String surname = in.next();
                System.out.println("Insert GPA: ");
                double gpa = in.nextDouble();
                Student s1 = new Student(name, surname, gpa);
                listStudents[i] = s1;
                i++;
            } else if (comand == 2) {
                for (int j = 0; j < i; j++) {
                    System.out.println(listStudents[j]);
                }
            } else if (comand == 0) {
                break;
            }
        }
    }
}