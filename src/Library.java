import java.time.LocalDate;

public class Library {
    public static void main(String[] args) {
        User youngUser = new User();
        youngUser.name = "Farhan junior";
        youngUser.birthDay = LocalDate.parse("1995-01-31");

        User olderUser = new User();
        olderUser.name = "Farhan senior";
        olderUser.birthDay = LocalDate.parse("1976-01-15");

        System.out.printf("%s was born in %s and he is %d years old.\n", youngUser.name, youngUser.birthDay, youngUser.age());

        System.out.printf("%s was born in %s and he is %d years old.", olderUser.name, olderUser.birthDay, olderUser.age());

    }
}