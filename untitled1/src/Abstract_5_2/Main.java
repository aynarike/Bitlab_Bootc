package Abstract_5_2;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        SphereGold sphereGold1 = new SphereGold(5);
        SphereGold sphereGold2 = new SphereGold(8);
        SphereGold sphereGold3 = new SphereGold(10);
        CubeGold cubeGold1 = new CubeGold(4.1);
        CubeGold cubeGold2 = new CubeGold(5.1);
        CubeGold cubeGold3 = new CubeGold(3.1);

        GoldShape [] goldShapes = {sphereGold1, sphereGold2, sphereGold3, cubeGold1, cubeGold2, cubeGold3};
        for (int i = 0; i< goldShapes.length; i++){
            System.out.println((i+1) + ". " + " " + goldShapes[i].getPrice());
        }
    }
}