package _4_3_inheritance_polymorphism;

public class Sportsman {
    protected String fullName;
    protected int age;
    protected String country;

    public Sportsman(String fullName, int age, String country){
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }
    public Sportsman(){

    }

    @Override
    public String toString() {
        return fullName + " " + age + " " + country;
    }

    public void play(){
        System.out.println(toString() + " is playing");
    }
}