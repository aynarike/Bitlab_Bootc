package _9_1_ArrayList;

import java.util.ArrayList;

public class main {
    public static void main(String[]args){
        Players players1 = new Players("Mason Mount", 75000, 30);
        Players players2 = new Players("Jadon Sancho", 75000, 28);
        Players players3 = new Players("Trent Alex", 80000, 36);
        Players players4 = new Players("Declan Rice", 80000, 35);
        Players players5 = new Players("Mason Mount", 75000, 33);
        Players players6 = new Players("Jude Bellingham", 80000, 32);
        Players players7 = new Players("Pedri", 80000, 31);
        Players players8 = new Players("Dusan Vlahovic", 85000, 29);
        Players players9 = new Players("Phil Foden", 90000, 28);
        Players players10 = new Players("Kylian Mbappe", 160000, 36);


        ArrayList <Players> list = new ArrayList();
        list.add(players1);
        list.add(players2);
        list.add(players3);
        list.add(players4);
        list.add(players5);
        list.add(players6);
        list.add(players7);
        list.add(players8);
        list.add(players9);
        list.add(players10);
        int sum = 0;
        double count = 0;
        double average = 0;

        for (int i = 0; i< list.size(); i++){
            sum = sum + list.get(i).age;
            count = count + list.get(i).price;
            average = count/ list.size();
        }
        System.out.print(sum + " " + average);
    }
}