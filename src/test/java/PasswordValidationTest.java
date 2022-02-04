import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    // Tests for password Length case
    @Test
    void isPasswordHigherThenPwdLength(){
        //given
        String password = "password1";

        //when
        boolean result = PasswordValidation.validatePasswordLength(password);

        //then
        assertTrue(result);
    }

    @Test
    void isPasswordEqualsPwdLength(){
        //given
        String password = "password";

        //when
        boolean result = PasswordValidation.validatePasswordLength(password);

        //then
        assertTrue(result);
    }

    @Test
    void isPasswordLowerPwdLength(){
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

    // Tests for length and number check
    @Test
    void passwordWithRightNumAndLengthCriteria() {
        //given
        String password = "passw0rd";

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

}