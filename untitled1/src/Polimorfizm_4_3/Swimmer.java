package Polimorfizm_4_3;

public class Swimmer  extends Sportsman{
    String style;
    double recordTime;

    public Swimmer(){
        super();
        this.style = "Null";
        this.recordTime = 0;
    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    @Override
    public void play(){
        System.out.println(toString() + " " + style + " " + recordTime + " " + "is playing");
    }
}