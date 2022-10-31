package Class_and_object_2_student;

public class Main {
    public static void main(String[]args){
        Student s1 = new Student(1, "Hermione,", "Granger,", 5);
        Student s2 = new Student(2, "Neville,", "Longbottom,", 3.2);
        Student s3 = new Student(3, "Luna,", "Lovegood,", 4);
        Student s4 = new Student(4, "Harry,", "Potter,", 4.1);
        Student s5 = new Student(5, "Ronald,", "Weasley,", 4.5);
        Student s6 = new Student(6, "Draco,", "Malfoy,", 4.0);
        Student s7 = new Student(7, "Alastor,", "Moody,", 3.9);
        Student s8 = new Student(8, "Rubeus,", "Hagrid,", 3.5);
        Student s9 = new Student(9, "Remus,", "Lupin,", 4.5);
        Student s10 = new Student(10, "Albus,", "Dumbledore,", 4.8);

        Student [] students = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
        for (int i = 0; i< students.length; i++){
            System.out.println((i+1) + ". " + students[i].getStudentData());
        }
        System.out.println(topStudent(students).getStudentData());
    }

    static Student topStudent(Student[] students){
        Student max = students[0]; //ссылается на нулевой индекс массива
        for (int i = 1; i< students.length; i++){
            if (max.gpa<students[i].gpa){
                max = students[i];
            }
        }
        return max;
    }
}