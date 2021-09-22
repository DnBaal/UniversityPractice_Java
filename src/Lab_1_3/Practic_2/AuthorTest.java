package Lab_1_3.Practic_2;

public class AuthorTest {

    public static void main(String[] args) {

        Author author = new Author("Чехов", "chehov@mail.ru", 'M');

        System.out.println(author);

        System.out.println("Changing email..");
        author.setEmail("new-chehov@mail.ru");
        System.out.println(author);

    }
}
