package Polimorfizm_4_1;

public class Mercedes extends Car{
    String classType;

    public Mercedes(){
        this.classType = "Null";
    }

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    @Override
    public void ride(){
        System.out.println(toString() + classType + " " + "is riding");
    }
}