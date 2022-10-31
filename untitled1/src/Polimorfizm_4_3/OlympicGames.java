package Polimorfizm_4_3;

public class OlympicGames {
    String city;
    int year;
    Sportsman sportsmansList[];

    public OlympicGames(String city, int year, Sportsman[] sportsmansList) {
        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmansList;
    }
    public void play(){
        for (int i = 0; i<sportsmansList.length; i++){
            sportsmansList[i].play();
        }
    }
}