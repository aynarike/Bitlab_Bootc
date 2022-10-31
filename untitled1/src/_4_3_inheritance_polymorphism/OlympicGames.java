package _4_3_inheritance_polymorphism;

public class OlympicGames {
    String city;
    int year;
    Sportsman [] sportsmansList;

    public OlympicGames(){

    }
    public OlympicGames(String city, int year, Sportsman [] sportsmansList){
        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmansList;
    }
    public void play (){
        for (int i = 0; i<sportsmansList.length; i++) {
            System.out.println((i + 1) + ". " + sportsmansList[i] + " is playing");
            if ((i + 1) % 3 == 0) System.out.println();
        }
    }
}