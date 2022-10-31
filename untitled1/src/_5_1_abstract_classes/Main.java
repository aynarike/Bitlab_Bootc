package _5_1_abstract_classes;

public class Main {
    public static void main(String[]args){
        Chocolate choco1 = new Chocolate("Snickers", 100);
        Chocolate choco2 = new Chocolate("Twix", 110);
        Burger burger1 = new Burger("Burger King", 50, 1);
        Burger burger2 = new Burger("McDonalds", 75, 2);
        Coke cokes1 = new Coke("Coca Cola", 0.5, true);
        Coke cokes2 = new Coke("Fuse Tea", 1, false);

        double max = 0;
        int index = 0;
        Food[] foods = {choco1, choco2, burger1, burger2, cokes1, cokes2};
        for (int i = 0; i< foods.length; i++) {

            System.out.println((i + 1) + ". " + foods[i].name + " " + foods[i].getCalories() + "calories");
            if (max<foods[i].getCalories()){
                max=foods[i].getCalories();
                index = i;
            }
        }
        System.out.println(foods[index].toString() + " " + max + " callories");
    }
}