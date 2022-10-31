package Polimorfizm_4_1;

public class Car {
    String name;
    String model;
    int maxSpeed;
    int year;
    double volume;

    public Car() {
        this.name = "Null";
        this.model = "Null";
        this.maxSpeed = 0;
        this.year = 0;
        this.volume = 0;
    }

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public void ride(){
        System.out.println(toString() + " " + "is riding");
    }
    public String toString(){
        return name + " " + model + " "
                + maxSpeed + " " + year + " " + volume;
    }
}