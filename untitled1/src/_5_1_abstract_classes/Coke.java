package _5_1_abstract_classes;

public class Coke extends Food{
    double volumeLiters;
    boolean isSparkling;

    public Coke(){
    }
    public Coke(String name, double volumeLiters, boolean isSparkling){
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    @Override
    public String toString() {
        return name + " " + volumeLiters + " " + isSparkling;
    }

    @Override
    public double getCalories() {
        if (isSparkling){
            return 400*volumeLiters;
        }else {
            return 100*volumeLiters;
        }
    }
}