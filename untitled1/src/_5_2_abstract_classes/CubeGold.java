package _5_2_abstract_classes;

public class CubeGold extends GoldShape{
    double side;

    public CubeGold(){
    }
    public CubeGold(double side){
        this.side = side;
    }

    @Override
    public double getVolume() {
        return side*side*side;
    }
}