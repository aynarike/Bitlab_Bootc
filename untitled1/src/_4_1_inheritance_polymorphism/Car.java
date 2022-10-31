package _4_1_inheritance_polymorphism;

public class Car {
    protected String name;
    protected String model;
    protected int maxSpeed;
    protected int year;
    protected double volume;

    public Car(String name, String model, int maxSpeed, int year, double volume){
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume= volume;
    }
     public Car(){
         this.name = "Null";
         this.model = "Null";
         this.maxSpeed = 0;
         this.year = 0;
         this.volume = 0;
     }

    @Override
    public String toString() {
        return "Car " + name + " " + model + " " + maxSpeed + " " + year + " " + volume + "is riding";
    }

    public void ride(){
        System.out.println(toString());
     }
}