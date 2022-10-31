package Abstract_5_2;

public abstract class GoldShape {
    public abstract double getVolume();


    public double getPrice(){
        return getVolume()*250+1200;
    }
}