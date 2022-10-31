package _4_3_inheritance_polymorphism;

public class Gymnast extends Sportsman{
    protected int height;
    protected int weight;
    protected String style;

    public Gymnast(){

    }
    public Gymnast(String fullName, int age, String country, int height, int weight, String style){
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }
    public String toString(){
        return super.toString() + " " + height + " " + weight + " " + style;
    }

    @Override
    public void play(){
        System.out.println(toString()+ " is playing");
    }
}