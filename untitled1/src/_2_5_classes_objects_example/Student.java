package _2_5_classes_objects_example;

public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student(){
    }
    public Student(int id, String name, String surname, double gpa){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public Student(String name, String surname, double gpa){
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student, " + "name " + name + ", surname " + surname + ", gpa " + gpa;
    }

    public String getStudentData(){
        return this.id + " " + this.name + " " + this.surname + " " + this.gpa;
    }
}