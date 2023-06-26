import java.time.LocalDate;

public class Library {
    public static void main(String[] args) {
//        User user = new User("Farhan junior", "1995-01-31");
//        user.name = "Farhan junior";
//        user.birthDay = LocalDate.parse("1995-01-31");

        Book carmilla= new Book("Carmilla", "Sheridan le Fanu", 270);

//        book.title = "Carmilla";
//        book.author = "Sheridan le Fanu";

        AudioBook dracula= new AudioBook("Dracula", "Bram Stoker",30000 );

//        System.out.printf("%s was born in %s and he is %d years old.\n", user.getName(), user.getBirthDay(), user.age());
//        System.out.printf("%s has borrowed these books: %s \n", user.getName(), user.borrowedBooks());

        eBook jeeves = new eBook("Carry on jeeves", "P.G Wodehouse", 280, "PDF");

        System.out.println(dracula.toString());
        System.out.println(jeeves.toString());
    }
}