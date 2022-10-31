package _2_1_classes_objects;

public class Phone {
    String name;
    String model;
    int price;

    public Phone(){
    }
    public Phone(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }
    public String getDate(){
        return this.name + " " + this.model + " " + this.price;
    }
}
