package Abstract_5_1;

public class Burger extends Food{
    int meatAmount;
    int meatType;

    public Burger() {
    }

    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    @Override
    public String toString(){
        return name + " " + meatAmount + " " + meatType;
    }

    @Override
    public double getCalories(){
        if (meatType==1){
         return 840*meatAmount;
        } else {
            return 560*meatAmount;
        }
    }
}