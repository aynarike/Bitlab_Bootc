package _4_5_inheritance_polymorphism;

public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff (){}
    public Staff(String login, String password, String name, String surname, double salary){
        super(login, password, name, surname);
        this.salary = salary;
    }
    public double getSalary(){

        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public int getIndexOfSubject(){
        return indexOfSubject;
    }
    public void setSubjects(int indexOfSubject){
        this.subjects = subjects;
    }
    public String toString(){
        return super.toString() + " " + salary;
    }

    public void getData(){
        System.out.println("Staff, " + toString());
    }
    public void addSubject (String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }
    public void printSubject(){
        for (int i = 0; i<indexOfSubject; i++){
            System.out.println(subjects[i]);
        }
    }
}