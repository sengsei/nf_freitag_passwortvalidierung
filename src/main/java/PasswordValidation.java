public class PasswordValidation {

    final static int PASSWORDLENGTH = 8;

    public static boolean validatePasswordArray(String[] passwords) {

        for (String s : passwords) {
            if (!validatePassword(s)) {
                System.out.println("Your Array contains one ore more wrong passwords!");
                return false;
            }
        }
        return true;
    }

    public static boolean validatePassword(String password) {
        return validatePasswordLength(password)
                && validateIfPasswordConsistsNums(password)
                && validateLowerAndUpperCase(password);
    }

    private static boolean validatePasswordLength(String password) {
        if (!(password.length() >= PASSWORDLENGTH)) {
            System.out.println("Your password has only " +
                    password.length() + " letters! You need " + PASSWORDLENGTH + " ones.");
        }
        return password.length() >= PASSWORDLENGTH;
    }

    private static boolean validateIfPasswordConsistsNums(String password) {
        boolean consistsNumbers = password.chars().anyMatch(Character::isDigit);
        if (!consistsNumbers){
            System.out.println("Your password needs one oder more numbers!");
        }
        return consistsNumbers;
    }

    private static boolean validateLowerAndUpperCase(String password) {
        char currentChar;
        boolean isUppercase = false;
        boolean isLowerCase = false;
        for (int i = 0; i < password.length(); i++) {
            currentChar = password.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                isLowerCase = true;
            }
            if (Character.isUpperCase(currentChar)) {
                isUppercase = true;
            }
        }
        if (!(isLowerCase && isUppercase)) {
                System.out.println("Your password needs lowercase AND uppercase letters!");
        }
        return (isLowerCase && isUppercase);
    }

}
