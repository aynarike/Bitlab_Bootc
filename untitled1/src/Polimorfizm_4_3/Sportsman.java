package Polimorfizm_4_3;

public class Sportsman {
    String fullName;
    int age;
    String country;

    public Sportsman(){
        this.fullName = "Null";
        this.age = 0;
        this.country = "Null";
    }

    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public void play(){
        System.out.println(toString() + " " + "is playing");

    }
    public String toString (){
        return fullName + " " + age + " " + country;
    }
}