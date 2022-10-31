package _8_2_Try_catch;

public class Library {
    String name;
    String city;
    Book[] books = new Book[5];
    int index = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Library(){
    }
    public Library(String name, String city){
        this.name = name;
        this.city = city;

    }
    public void addBook(Book book){
        books[index] = book;
        index++;
    }
    public void printBooks(Book[] books){
        for (int i = 0; i<books.length; i++) {

            System.out.println(books[i].toString());
        }
    }
}

