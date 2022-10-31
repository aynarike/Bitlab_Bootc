package Class_and_object_3_Press;

public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student(){
        this.id = 0;
        this.name = "Null";
        this.surname = "Null";
        this.gpa = 0;
    }

    public Student(int id, String name, String surname, double gpa){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public Student(String name, String surname, double gpa) {
    }

    public String getStudentData(){
        return "Id: " + id + " Name: " + name + " Surname: " + surname + " Gpa: " + gpa;
    }
}