package _4_5_inheritance_polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);







        Student student1 = new Student("Alpha01", "010101", "Alex", "King", 5.1);
        Student student2 = new Student("Beast02", "020202", "Anthony", "Lee", 5.2);
        Student student3 = new Student("BraveSpirit03", "030303", "Brandon", "Lewis", 5.3);
        Student student4 = new Student("Casanova04", "040404", "Christopher", "Martin", 5.4);
        Student student5 = new Student("Commando05", "050505", "David", "Miller", 5.5);

        Staff staff1 = new Staff("DillMo", "060606", "Dillon", "Moore",10000);
        Staff staff2 = new Staff("Erob", "060606", "Ethan", "Robinson",10000);
        Staff staff3 = new Staff("Fred001", "060606", "Fred", "Taylor",10000);
        Staff staff4 = new Staff("JTom01", "060606", "Josh", "Thomas",10000);
        Staff staff5 = new Staff("JustinWhite", "060606", "Justin", "White",10000);


        User user1 = new User("Detector001", "010101", "Kevin", "Wilson");
        User user2 = new User("Dragon02", "020202", "Ryan", "Young");
        User user3 = new User("Hawk03", "030303", "Thomas", "Johnson");
        User user4 = new User("Kille04", "040404", "Tyler", "Jackson");
        User user5 = new User("Phantom05", "050505", "William", "Harris");

        User [] users = {student1, student2, student3, student4, student5, staff1, staff2, staff3, staff4, staff5, user1, user2, user3, user4, user5};

        student1.addCourse("Math");
        student2.addCourse("Math");
        student3.addCourse("Math");
        student4.addCourse("Math");
        student5.addCourse("Math");
        student1.addCourse("Literature");
        student2.addCourse("English");
        student3.addCourse("Biology");
        student4.addCourse("Physics");
        student5.addCourse("History");

        staff1.addSubject("Literature");
        staff2.addSubject("English");
        staff3.addSubject("Biology");
        staff4.addSubject("Physics");
        staff5.addSubject("History");
        staff1.addSubject("Geography");
        staff2.addSubject("Math");
        staff3.addSubject("Geometry");
        staff4.addSubject("Music");
        staff5.addSubject("Technology");

        for (User user : users) {
            user.getData();
            if (user instanceof Staff) ((Staff) user).printSubject();
            else if (user instanceof Student) ((Student) user).printCourse();
            if (user instanceof Student || user instanceof Staff) System.out.println();

        }
    }
}