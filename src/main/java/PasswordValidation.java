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
        if (!validatePasswordLength(password)) {
            System.out.println("Your password has only " +
                    password.length() + " letters! You need " + PASSWORDLENGTH + " ones.");
        }
        if (!validateLowerAndUpperCase(password)) {
            System.out.println("Your password needs lowercase AND uppercase letters!");
        }
        if (!validateIfPasswordConsistsNums(password)) {
            System.out.println("Your password needs one oder more numbers!");
        }

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
