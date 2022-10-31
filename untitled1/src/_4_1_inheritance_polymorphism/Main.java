package _4_1_inheritance_polymorphism;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("KIA", "Sportage", 1000, 2020, 2.0);
        Car c2 = new Car("KIA", "Sorento", 1001, 2021, 2.5);
        Car c3 = new Car("KIA", "Soul", 1002, 2022, 1.8);
        Toyota toyota1 = new Toyota("Toyota", "Corolla", 2000, 2021, 3.0, "Japon");
        Toyota toyota2 = new Toyota("Toyota", "Camry", 2001, 2020, 3.0, "Japon");
        Toyota toyota3 = new Toyota("Toyota", "RAV4", 2002, 2021, 3.0, "Japon");
        Mercedes mercedes1 = new Mercedes("Mercedes", "GLS AMG", 3000, 2021, 4.0, "S");
        Mercedes mercedes2 = new Mercedes("Mercedes", "GLS Maybach", 3001, 2020, 4.0, "B");
        Mercedes mercedes3 = new Mercedes("Mercedes", "S-Class Cabriolet", 3002, 2022, 4.0, "E");

        Car[] cars = {c1, c2, c3, toyota1, toyota2, toyota3, mercedes1, mercedes2, mercedes3};
        for(int i=0; i<cars.length; i++){
        cars[i].ride();
        }
    }
}