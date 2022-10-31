package _5_1_abstract_classes;

public class Chocolate extends Food{
    int weight;

    public Chocolate(){
    }
    public Chocolate(String name, int weight){
        super(name);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + weight + " gramm";
    }

    @Override
    public double getCalories() {
        return weight*740;
    }
}