package _5_1_abstract_classes;

public abstract class Food {
    String name;
    public abstract double getCalories();

    public Food(){
    }
    public Food(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}