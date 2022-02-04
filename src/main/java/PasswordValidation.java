public class PasswordValidation {

    final static int PASSWORDLENGTH = 8;

    public static boolean validatePasswordArray(String[] passwords) {
        boolean currentState = true;
        for (String s : passwords) {
            if (!validatePassword(s)) {
                return false;
            }
        }
        return currentState;
    }

    public static boolean validatePassword(String password) {
        return validatePasswordLength(password)
                && validateIfPasswordConsistsNums(password)
                && validateLowerAndUpperCase(password);
    }

    public static boolean validatePasswordLength(String password) {
        return password.length() >= PASSWORDLENGTH;
    }

    public static boolean validateIfPasswordConsistsNums(String password) {
        return password.chars().anyMatch(Character::isDigit);
    }

    public static boolean validateLowerAndUpperCase(String password) {
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
        return (isLowerCase && isUppercase);
    }

}
