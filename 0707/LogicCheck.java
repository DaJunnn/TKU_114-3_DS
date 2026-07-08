public class LogicCheck {
    public static void main(String[] args) {
        String username = "dajun";
        String password = "411631178";

        String inputUsername = "dajun";
        String inputPassword = "411631178";

        boolean loginSuccess =
                username.equals(inputUsername)
                && password.equals(inputPassword);

        System.out.println("Login success: " + loginSuccess);
    }
}