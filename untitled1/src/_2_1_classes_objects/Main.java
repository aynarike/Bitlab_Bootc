package _2_1_classes_objects;

public class Main {
    public static void main(String[]args){
        Phone phone1 = new Phone("iPhone", "SE", 850000);
        Phone phone2 = new Phone("iPhone", "13 Pro Max", 750000);
        Phone phone3 = new Phone("iPhone", "iPhone 13 Pro", 600000);
        Phone phone4 = new Phone("iPhone", "iPhone 13", 550000);
        Phone phone5 = new Phone("iPhone", "iPhone 13 mini", 500000);

        Phone [] phones = {phone1, phone2, phone3, phone4, phone5};
        for (int i = 0; i< phones.length; i++)
            System.out.println((i+1) + ". " + phones[i].getDate() + " tenge");
    }
}