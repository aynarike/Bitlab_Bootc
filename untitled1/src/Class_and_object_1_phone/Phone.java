package Class_and_object_1_phone;

public class Phone {
    String name;
    String model;
    int price;

    public Phone(){
        this.name = "No Name";
        this.model = "No Name";
        this.price = 0;
    }
    public Phone (String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getData(){
        return "Name: " + name + " Model: " + model + " Price: " + price;
    }
}