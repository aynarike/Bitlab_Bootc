package _4_3_inheritance_polymorphism;

public class Swimmer extends Sportsman{
    protected String style;
    protected double recordTime;

    public Swimmer(){

    }
    public Swimmer(String fullName, int age, String country, String style, double recordTime){
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }
    public String toString(){
        return super.toString() + " " + style + " " + recordTime;
    }
    @Override
    public void play(){
        System.out.println(toString()+ " is playing");
    }
}