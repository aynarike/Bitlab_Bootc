package Class_and_object_1_phone;

public class Main {
    public static void main(String[]args){
        Phone p1 = new Phone("iPhone,", "14,", 1500);
        Phone p2 = new Phone("iPhone,", "14 Plus, ", 2000);
        Phone p3 = new Phone("iPhone,", "13,", 1200);
        Phone p4 = new Phone("iPhone,", "13 Plus,", 1300);
        Phone p5 = new Phone("iPhone,", "12,", 1000);

        Phone [] phones = {p1, p2, p3, p4, p5};
        for (int i = 0; i<phones.length; i++){
            System.out.println((i+1)+"." + " " + phones[i].getData());
        }
    }
}