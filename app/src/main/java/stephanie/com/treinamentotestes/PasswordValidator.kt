package stephanie.com.treinamentotestes

import java.util.*

class PasswordValidator {

    //um numero e um caractere especial

    fun isValid(password: String): Boolean {
        return password.length >= 8
    }

    fun hasUpperCase(password: String): Boolean {
        val separado = password.split(",").toTypedArray()
        val mapeado = separado.map { item ->
            item == item.toUpperCase(Locale.ROOT)
        }
        return mapeado.contains(true)
    }

    fun hasLoweCase(password: String): Boolean {
        val mapeado = (password.split(",").toTypedArray()).map { item ->
            item == item.toLowerCase(Locale.ROOT)
        }
        return mapeado.contains(true)
    }

    fun hasNumber(password: String): Boolean {

        val array = password.toCharArray()
        val acao = array.map { char ->
            !char.isLetter()
        }
        acao.contains(true)
        return false
    }


}
