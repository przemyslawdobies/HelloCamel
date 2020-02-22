package pl.atkom.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.altkom.utils.HelloUtil;

import static org.junit.jupiter.api.Assertions.*;

class HelloCamelCaseTest {

    @Test
    @DisplayName("Test to upper case Hello")
    void test_Hello_To_Upper_Case() {
        //given
        String passedArgument = "TOMEK";
        String expectedValue = HelloCamelCase.GREETING+""+passedArgument;
        //When
        String returnValue = HelloCamelCase.greetWithUpperCase(passedArgument);
        //Then
        assertEquals(expectedValue, returnValue);
    }
}