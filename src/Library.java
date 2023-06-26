import java.time.LocalDate;

public class Library {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Farhan junior";
        user.birthDay = LocalDate.parse("1995-01-31");

        System.out.printf("%s was born in %s and he is %d years old.\n", user.name, user.birthDay, user.age());


    }
}