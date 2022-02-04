public class PasswordValidation {

    final static int PASSWORDLENGTH = 8;

    public static boolean validatePassword(String password) {
        return validatePasswordLength(password) && validateIfPasswordConsistsNums(password);
    }

    public static boolean validatePasswordLength(String password){
        return password.length() >= PASSWORDLENGTH;
    }

    public static boolean validateIfPasswordConsistsNums(String password) {
        return password.chars().anyMatch(Character::isDigit);
    }





}
