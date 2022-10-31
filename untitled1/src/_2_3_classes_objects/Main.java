package _2_3_classes_objects;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(100001, "Olivia", "Evans", 4.1);
        Student s2 = new Student(100002, "Amelia", "Johnson", 4.0);
        Student s3 = new Student(100003, "Mia", "Parson", 4.5);
        Student s4 = new Student(100004, "Ella", "Gilbert", 4.9);
        Student s5 = new Student(100005, "Scarlett", "Adamson", 4.2);
        Student s6 = new Student(100006, "Kevin", "Aldridge", 4.1);
        Student s7 = new Student(100007, "Adam", "Evans", 4.5);
        Student s8 = new Student(100008, "Ben", "Wilson", 4.0);
        Student s9 = new Student(100009, "Alexander", "Ellington", 5.2);
        Student s10 = new Student(100010, "Harry", "Potter", 6.2);


        Student[] students = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
        System.out.println(topStudent(students).getStudentData());
    }
    public static Student topStudent(Student students[]) {
        double maxGPA = 0;
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (maxGPA < students[i].gpa) {
                maxGPA = students[i].gpa;
                index = i;
            }
        }
        return students[index];
    }
}