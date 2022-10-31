package Polimorfizm_4_1;

public class Main {
    public static void main(String[] args) {
        Car Car1 = new Car("Bugatti", "La Voiture Noire", 378, 2019, 8.0);
        Car Car2 = new Car("Bugatti", "Centodieci", 380, 2019, 8.0);
        Car Car3 = new Car("Bugatti", "Chiron Super Sport", 7100, 2021, 8.0);

        Toyota Toyota1 = new Toyota("Toyota", "Alessandro Volta Concept", 250, 2004, 3.3, "Europe");
        Toyota Toyota2 = new Toyota("Toyota", "GT-One Road", 325, 1998, 3.6, "Europe");
        Toyota Toyota3 = new Toyota("Toyota", "2000GT", 220, 1988, 2.0, "Europe");

        Mercedes Mercedes1 = new Mercedes("Mercedes", "540 K Roadster", 185, 1938, 5.4, "USA");
        Mercedes Mercedes2 = new Mercedes("Mercedes", "McLaren Stirling Moss", 350, 2009, 5.4, "USA");
        Mercedes Mercedes3 = new Mercedes("Mercedes", "CLK GTR", 322, 1998, 6.9, "USA");

        Car[] cars = {Car1, Car2, Car3, Toyota1, Toyota2, Toyota3, Mercedes1, Mercedes2, Mercedes3};
        for (int i = 0; i < cars.length; i++) {
            System.out.print((i+1) + "." + " ");
            cars[i].ride();
        }
    }
}