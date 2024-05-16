public class CheckPassword {
    public static boolean longEnough(String password) {

        if (password.length() < 12) {
            return false;
        }
        return true;
    }

    public static boolean atLeastTwoDigits(String password) {

        char[] pass = new char[password.length()];
        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            pass[i] = password.charAt(i);

            if (Character.isDigit(pass[i])) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("Usage: java CheckPassword <password>");
            System.exit(1);
        }
        if (longEnough(args[0]) && atLeastTwoDigits(args[0])) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is not valid");
        }

    }
}
