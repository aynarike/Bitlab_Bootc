package _3_1_Incapsul_Set_Get;

public class Phone {
    private String name;
    private String model;
    private int price;
    private int memory;

    public Phone(String name, String model, int price, int memory) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }

    public Phone() {
        this.name = "No Name";
        this.model = "No model";
        this.price = 0;
        this.memory = 0;
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

    public String getCategory() {
        if (price > 1000) {
            return "TOP";
        } else if (price < 1000 && price > 500) {
            return "MEDIUM";
        } else {
            return "SIMPLE";
        }
    }
    public String getData(){
        return this.name + " " + this.model + " " + this.price + " " + this.memory;
    }
}