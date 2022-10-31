package _3_1_Incapsul_Set_Get;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("phone1", "1", 100, 100);
        Phone p2 = new Phone("phone2", "2", 200, 200);
        Phone p3 = new Phone("phone3", "3", 300, 300);
        Phone p4 = new Phone("phone4", "4", 400, 400);
        Phone p5 = new Phone("phone5", "5", 500, 500);
        Phone p6 = new Phone("phone6", "6", 600, 600);
        Phone p7 = new Phone("phone7", "7", 700, 700);
        Phone p8 = new Phone("phone8", "8", 800, 800);
        Phone p9 = new Phone("phone9", "9", 900, 900);
        Phone p10 = new Phone("phone10", "10", 1000, 1000);

        Phone[] phones = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
        for (int i = 0; i < phones.length; i++){
            if (phones[i].getCategory().equals("TOP") || phones[i].getCategory().equals("SIMPLE")){
                System.out.println(phones[i].getData());
            }
        }
    }
}