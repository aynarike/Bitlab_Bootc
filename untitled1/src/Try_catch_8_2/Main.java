package Try_catch_8_2;

public class Main {
    public static void main(String[]args){
        Book book1 = new Book(1, "Haha", "Omel");
        Book book2 = new Book(2, "Lala", "Omela");
        Book book3 = null;

        Library l1 = new Library("Central National", "KZ");
        l1.addBook(book1);
        l1.addBook(book2);
        l1.addBook(book3);
        l1.printBooks();
    }
}