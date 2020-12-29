package stephanie.com.treinamentotestes

import org.junit.Assert
import org.junit.Test

class PasswordValidatorTest {
    private val passwordValidator = PasswordValidator()

    @Test
    fun givenPasswordShorterThan8_whenValidate_shouldReturnFalse() {
        // arrange

        // act
        val result = passwordValidator.isValid("1234567")

        // assert
        Assert.assertFalse(result)
    }

    @Test
    fun giveMePassowrdWithoutUpperCase_whenValidate_shouldReturnFalse() {

        val resultado = passwordValidator
                .hasUpperCase("nao tem maiusculo")

            Assert.assertFalse(resultado)
    }

    @Test
    fun giveMePassowrWhitLowerrCase_whenValidate_shouldReturnFalse(){
        val resultado = passwordValidator
                .hasLoweCase("Tem maiusculo")

        Assert.assertFalse(resultado)
    }

    @Test
    fun  givenPasswordContainsANumber_whenValidate_shouldReturnFalse() {

        val resultado = passwordValidator
                .hasNumber("12345")
        Assert.assertFalse(resultado)

    }

}