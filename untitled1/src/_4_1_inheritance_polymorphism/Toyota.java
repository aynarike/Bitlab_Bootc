package _4_1_inheritance_polymorphism;

public class Toyota extends Car{
    protected String manufacturer;

    public Toyota(){
        super();
        this.manufacturer = "Null";
    }
    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer){
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    public String toString() {
        return "Car " + name + " " + model + " " + maxSpeed + " " + year + " " + volume + " " + manufacturer + "is riding";
    }

    @Override
    public void ride(){
        System.out.println(toString());
    }
}