package _4_3_inheritance_polymorphism;

public class Main {
    public static void main(String[] args) {
        Gymnast gymnast1 = new Gymnast("Bob", 23, "USA", 193, 80, "A");
        Gymnast gymnast2 = new Gymnast("Gleb", 24, "USA", 194, 85, "B");
        Gymnast gymnast3 = new Gymnast("Yan", 23, "USA", 195, 85, "C");
        Footballer footballer1 = new Footballer("Venya", 25, "USA", "attack", "D");
        Footballer footballer2 = new Footballer("Gay", 23, "USA", "protection", "D");
        Footballer footballer3 = new Footballer("Bred", 24, "USA", "goalkeeper", "E");
        Swimmer swimmer1 = new Swimmer("Rassel", 25, "USA", "freestyle", 6.0);
        Swimmer swimmer2 = new Swimmer("Gayan", 23, "USA", "freestyle", 6.5);
        Swimmer swimmer3 = new Swimmer("Bil", 24, "USA", "freestyle", 6.1);

        Sportsman [] sportsmen = {gymnast1, gymnast2, gymnast3, footballer1, footballer2, footballer3, swimmer1, swimmer2, swimmer3};

        OlympicGames olympicGames = new OlympicGames("Almaty", 2022, sportsmen);
        olympicGames.play();
    }
}