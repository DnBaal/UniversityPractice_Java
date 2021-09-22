package Lab_1_3.Practic_1;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String toString() {
        return "Название: " + this.name + ", автор: " + this.author;
    }
}
