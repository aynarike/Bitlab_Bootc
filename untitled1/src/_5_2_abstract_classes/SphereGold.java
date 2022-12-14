package _5_2_abstract_classes;

public class SphereGold extends GoldShape{
    double radius;

    public SphereGold(){
    }
    public SphereGold(double radius){
        this.radius = radius;
    }
    @Override
    public double getVolume(){
        return ((4/3)*3.14)*radius*radius*radius;
    }
}