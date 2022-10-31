package _4_5_inheritance_polymorphism;

public class Student extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student(){}
    public Student(String login, String password, String name, String surname, double gpa){
        super(login, password, name, surname);
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public String toString(){
        return super.toString() + " " + gpa;
    }
    public void getData(){
        System.out.println("Student, " + toString());
    }
    public void addCourse(String course){
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }
    public void printCourse(){
        for (int i = 0; i<indexOfCourses; i++){
            System.out.println(courses[i]);
        }
    }
}