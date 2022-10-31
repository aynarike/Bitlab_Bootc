package _5_2_abstract_classes;

public class Main {
    public static void main(String[]args){
        SphereGold sphereGolds1 = new SphereGold(1);
        SphereGold sphereGolds2 = new SphereGold(2);
        SphereGold sphereGolds3 = new SphereGold(3);
        CubeGold cubeGolds1 = new CubeGold(4);
        CubeGold cubeGolds2 = new CubeGold(5);
        CubeGold cubeGolds3 = new CubeGold(6);

        GoldShape[] goldShapes = {sphereGolds1, sphereGolds2, sphereGolds3, cubeGolds1, cubeGolds2, cubeGolds3};
        for (int i = 0; i<goldShapes.length; i++){
            System.out.println((i+1) + ". " + goldShapes[i].getPrice());
        }
    }
}