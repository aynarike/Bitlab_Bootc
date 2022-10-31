package Inkapsul;

public class Main {
    public static void main(String[]args){
        Phone p1 = new Phone("iPhone,", "12 Pro,", 400, 128);
        Phone p2 = new Phone("iPhone,", "12 Pro Max,", 400, 256);
        Phone p3 = new Phone("iPhone,", "13,", 500, 64);
        Phone p4 = new Phone("iPhone,", "13 Pro,", 850, 128);
        Phone p5 = new Phone("iPhone,", "13 Pro Max,", 900, 64);
        Phone p6 = new Phone("iPhone,", "SE,", 1200, 128);
        Phone p7 = new Phone("iPhone,", "14,", 1400, 64);
        Phone p8 = new Phone("iPhone,", "14 Plus,", 1500, 256);
        Phone p9 = new Phone("iPhone,", "14 Pro,", 1900, 128);
        Phone p10 = new Phone("iPhone,", "14 Pro Max,", 2000, 128);

        Phone [] phones = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
        for (int i = 0; i<phones.length; i++){
            System.out.println((i+1)+"." + phones[i].getCategory()+ " " + phones[i].getName() + " " + phones[i].getModel());
        }
    }
}