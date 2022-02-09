import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void isPasswordLowerPwdLength() {
        //given
        String password = "pass";

        //when
        boolean result = PasswordValidation.validatePassword(password);

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