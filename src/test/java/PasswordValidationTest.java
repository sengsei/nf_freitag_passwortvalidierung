import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    // Tests for password Length case
    @Test
    void isPasswordHigherThenPwdLength() {
        //given
        String password = "password1";

        //when
        boolean result = PasswordValidation.validatePasswordLength(password);

        //then
        assertTrue(result);
    }

    @Test
    void isPasswordEqualsPwdLength() {
        //given
        String password = "password";

        //when
        boolean result = PasswordValidation.validatePasswordLength(password);

        //then
        assertTrue(result);
    }

    @Test
    void isPasswordLowerPwdLength() {
        //given
        String password = "pass";

        //when
        boolean result = PasswordValidation.validatePasswordLength(password);

        //then
        assertFalse(result);
    }

    // Tests for password contains numbers case
    @Test
    void passwordConsistsNumbers() {
        //given
        String password = "passw0rd";

        //when
        boolean result = PasswordValidation.validateIfPasswordConsistsNums(password);

        //then
        assertTrue(result);
    }

    @Test
    void passwordNotConsistsNumbers() {
        //given
        String password = "passwrd";

        //when
        boolean result = PasswordValidation.validateIfPasswordConsistsNums(password);

        //then
        assertFalse(result);
    }


    // Test for lower and upper cases
    @Test
    void passwordContainsLowerAndUpperCaseLetters() {
        //given
        String password = "Password";

        //when
        boolean result = PasswordValidation.validateLowerAndUpperCase(password);

        //then
        assertTrue(result);
    }

    @Test
    void passwordUpperCaseLetters() {
        //given
        String password = "PASSWORD";

        //when
        boolean result = PasswordValidation.validateLowerAndUpperCase(password);

        //then
        assertFalse(result);
    }

    @Test
    void passwordLowerCaseLetters() {
        //given
        String password = "password";

        //when
        boolean result = PasswordValidation.validateLowerAndUpperCase(password);

        //then
        assertFalse(result);
    }

    // Tests for all Criterias
    @Test
    void passwordWithAllCriterias() {
        //given
        String password = "Passw0rd";

        //when
        boolean result = PasswordValidation.validatePassword(password);

        //then
        assertTrue(result);
    }

    @Test
    void passwordWithRightNumAndWrongLengthCriteria() {
        //given
        String password = "w0rd";

        //when
        boolean result = PasswordValidation.validatePassword(password);

        //then
        assertFalse(result);
    }

    @Test
    void passwordWithWrongNumAndRightLengthCriteria() {
        //given
        String password = "wordddddddd";

        //when
        boolean result = PasswordValidation.validatePassword(password);

        //then
        assertFalse(result);
    }

    // Test for Array of Passwords
    @Test
    void arrayPasswordCheckWithOneFalsePasswords() {
        //given
        String[] passwords = {"password", "Passw0rd"};

        //when
        boolean result = PasswordValidation.validatePasswordArray(passwords);

        //then
        assertFalse(result);
    }

    @Test
    void arrayPasswordCheckWithMoreThanOneFalsePasswords() {
        //given
        String[] passwords = {"password", "Passw0rd", "passW0r"};

        //when
        boolean result = PasswordValidation.validatePasswordArray(passwords);

        //then
        assertFalse(result);
    }

    @Test
    void arrayPasswordWithAllCriterias() {
        //given
        String[] passwords = {"Passw0rd", "Passw0rd1", "passW0rd123"};

        //when
        boolean result = PasswordValidation.validatePasswordArray(passwords);

        //then
        assertTrue(result);
    }

}