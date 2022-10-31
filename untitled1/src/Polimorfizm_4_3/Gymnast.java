package Polimorfizm_4_3;

public class Gymnast extends Sportsman {
    int height;
    int weight;
    String style;

    public Gymnast() {
        super();
        this.height = 0;
        this.weight = 0;
        this.style = "Null";
    }

    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    @Override
    public void play(){
        System.out.println(toString() + " " + height + " " + weight + " " + style + " " + "is playing");
    }
}