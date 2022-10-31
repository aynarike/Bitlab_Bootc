package Abstract_5_1;

public class Main {
    public static void main(String[]args){
        Chocolate choco1 = new Chocolate("Snickers", 100);
        Chocolate choco2 = new Chocolate("Twix", 200);
        Burger burger1 = new Burger("Burger King", 200, 1);
        Burger burger2 = new Burger("McDonalds", 350, 2);
        Coke coke1 = new Coke("Coca Cola", 2000, true);
        Coke coke2 = new Coke("Fuse Tea", 1000, false);

        Food [] foods = {choco1, choco2, burger1, burger2, coke1, coke2};
        double max = Integer.MIN_VALUE;
        for (int i = 0; i< foods.length; i++){
            if (foods[i].getCalories()>max){
                max = foods[i].getCalories();
            }
            System.out.println((i+1) + ". " + foods[i]);
            System.out.println(foods[i].getCalories());
        }
        System.out.println(max);
    }
}