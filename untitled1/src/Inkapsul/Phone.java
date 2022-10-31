package Inkapsul;

public class Phone {
    String name;
    String model;
    int price;
    int memory;

    public Phone(){
        this.name = "Null";
        this.model = "Null";
        this.price = 0;
        this.memory = 0;
    }

    public Phone(String name, String model, int price, int memory) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getCategory(){
        if (price>1000){
            return "TOP";
        } else if (price<=1000 && price>=500) {
            return "MEDIUM";
        } else {
            return "SIMPLE";
        }
    }
}