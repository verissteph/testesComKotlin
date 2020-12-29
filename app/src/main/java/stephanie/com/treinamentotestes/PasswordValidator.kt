package stephanie.com.treinamentotestes

import java.util.*

class PasswordValidator {

    val validators = listOf(
            "[A-Z]",//letra maiuscula
            "[a-z]",//letra minuscula
            "[0-9]",//numeros
            "[\\W]",//que nao sao palavras
            "[\\w\\W]{8,}",
    ).map { it.toRegex() }

    fun isValid(password: String) = validators.all { validator ->
        password.contains(validator)
    }
}
