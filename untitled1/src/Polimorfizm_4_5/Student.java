package Polimorfizm_4_5;

public class Student extends User{
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student() {
        super();
        this.gpa = 0;
        this.indexOfCourses = 0;
    }

    public Student(int id, String login, String password, String name, String surname, double gpa, int indexOfCourses) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.indexOfCourses = indexOfCourses;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }
    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }

    @Override

    public void getData(){
        System.out.println(toString() + " " + gpa + " " +indexOfCourses);
        for (int i = 0; i<courses.length; i++){
            System.out.println(courses[i]);
        }
    }
    public void addCourse(String course){
        courses [indexOfCourses] = course;
    }
}




//    public void addSubject(String subject){
//        subjects [indexOfSubject] = subject;
//    }
//}