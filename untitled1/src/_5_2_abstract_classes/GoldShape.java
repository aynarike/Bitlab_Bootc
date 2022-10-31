package _5_2_abstract_classes;

public abstract class GoldShape {
    public abstract double getVolume();



    public double getPrice(){
     return getVolume() * 250 + 1200;
    }
}