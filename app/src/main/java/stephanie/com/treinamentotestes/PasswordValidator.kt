package stephanie.com.treinamentotestes

import java.util.*

class PasswordValidator {

    fun isValid(password: String): Boolean {
        return password.length >= 8
    }

    fun hasUpperCase(password: String):Boolean {
        val separado = password.split(",").toTypedArray()
      val mapeado = separado.map { item ->
            item == item.toUpperCase(Locale.ROOT)
        }
        return mapeado.contains(true)
    }

    fun hasLoweCase(password: String):Boolean{
       val mapeado = ( password.split(",").toTypedArray()).map{item->
        item == item.toLowerCase(Locale.ROOT)
       }
        return  mapeado.contains(true)
    }
}
