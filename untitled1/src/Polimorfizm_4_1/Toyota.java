package Polimorfizm_4_1;

public class Toyota extends Car{
    String manufacturer;

    public Toyota(){
        super();
        this.manufacturer = "Null";
    }

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }
    @Override
    public void ride(){
        System.out.println(toString() + " " + manufacturer + " " + "is riding");
    }
}