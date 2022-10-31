package Abstract_5_3;

public class Main {
    public static void main (String[] args){
        FerrariEngine ferrariEngine1 = new FerrariEngine(3.1, 5, 250);
        FerrariEngine ferrariEngine2 = new FerrariEngine(4.1, 6, 300);
        FerrariEngine ferrariEngine3 = new FerrariEngine(5.1, 7, 350);
        FerrariEngine ferrariEngine4 = new FerrariEngine(6.1, 8, 400);
        FerrariEngine ferrariEngine5 = new FerrariEngine(7.1, 9, 450);
        RenaultEnigine renaultEnigine1 = new RenaultEnigine(1.7, 5, 190, 1);
        RenaultEnigine renaultEnigine2 = new RenaultEnigine(1.6, 2, 150, 1);
        RenaultEnigine renaultEnigine3 = new RenaultEnigine(1.2, 3, 160, 1);
        RenaultEnigine renaultEnigine4 = new RenaultEnigine(1.3, 4, 170, 1);
        RenaultEnigine renaultEnigine5 = new RenaultEnigine(1.4, 5, 180, 1);

        Engine [] engines = {ferrariEngine1, ferrariEngine2, ferrariEngine3, ferrariEngine4, ferrariEngine5,
                renaultEnigine1, renaultEnigine2, renaultEnigine3, renaultEnigine4, renaultEnigine5};

        for (int i = 0; i<engines.length; i++){
            System.out.println(engines[i].getMaxSpeed());
        }
    }
}