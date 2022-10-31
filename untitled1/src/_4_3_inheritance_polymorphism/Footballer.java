package _4_3_inheritance_polymorphism;

public class Footballer extends Sportsman{
    protected String position;
    protected String club;

    public Footballer(){

    }
    public Footballer(String fullName, int age, String country, String position, String club){
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    public String toString(){
        return super.toString() + " " + position + " " + club;

    }
    @Override
    public void play(){
        System.out.println(toString()+ " is playing");
    }
}