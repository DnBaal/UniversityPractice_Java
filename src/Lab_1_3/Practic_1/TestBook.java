package Lab_1_3.Practic_1;

import java.util.Scanner;

public class TestBook {
    public static void RunTest() {
        Scanner sc = new Scanner(System.in);

        Book book1 = new Book("LOTR", "Tolkin");
        Book book2 = new Book("", "");

        System.out.println("Enter name of the book");
        String name = sc.nextLine();
        System.out.println("Enter author");
        String author = sc.nextLine();
        book2.setName(name);
        book2.setAuthor(author);
        System.out.println("Первая книга: " + book1.toString());
        System.out.println("Вторая книга: " + book2.toString());
    }
}
