package _8_1_Try_catch;

public class User {
    String name;
    String surname;
    int age;

    public User(){
    }
    public User(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}