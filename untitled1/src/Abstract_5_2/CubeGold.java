package Abstract_5_2;

public class CubeGold extends GoldShape{
    double side;

    public CubeGold() {
    }

    public CubeGold(double side) {
        this.side = side;
    }

    @Override
    public double getVolume(){
        return side*side*side;
    }
}