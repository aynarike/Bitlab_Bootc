package Polimorfizm_4_5;

public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
        super();
        this.salary = 0;
        this.indexOfSubject = 0;
    }

    public Staff(int id, String login, String password, String name, String surname, double salary, int indexOfSubject) {
        super(id, login, password, name, surname);
        this.salary = salary;
        this.indexOfSubject = indexOfSubject;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }
    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }

    @Override
    public void getData(){
        System.out.println(toString() + " " + salary + " " + indexOfSubject);
        for (int i = 0 ; i<subjects.length; i++){
            System.out.println(subjects [i]);
        }
    }
    public void addSubject(String subject){
        subjects [indexOfSubject] = subject;
    }
}