package _4_1_inheritance_polymorphism;

public class Mercedes extends Car{
    protected String classType;
    public Mercedes(){
        super();
        this.classType = "Null";
    }
    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType){
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public String toString() {
        return "Car " + name + " " + model + " " + maxSpeed + " " + year + " " + volume + classType + "is riding";
    }
    @Override
    public void ride(){
        System.out.println(toString());
    }
}