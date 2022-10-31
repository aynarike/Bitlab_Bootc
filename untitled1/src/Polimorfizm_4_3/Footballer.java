package Polimorfizm_4_3;

public class Footballer extends Sportsman {
    String position;
    String club;

    public Footballer(){
        this.position = "Null";
        this.club = "Null";
    }

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    @Override
    public void play(){
        System.out.println(toString()+ " " + position + " " + club + " " + "is playing");
    }
}