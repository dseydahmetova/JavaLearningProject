public class Switch {
    public static void main (String[] args) {
        String role = "admin";
        int password = 1;

        switch (role) {

            case "admin":
                System.out.println("You are admin");
                break;

            case "moderator":
                System.out.println("You re moderator");
                break;

            default:
                System.out.println("You are guest");
        }

        switch (password) {

            case 1:
                System.out.println("You are admin");
                break;

            case 2:
                System.out.println("You re moderator");
                break;

            default:
                System.out.println("You are guest");
        }
    }
}
