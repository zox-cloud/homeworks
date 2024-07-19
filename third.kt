import java.util.*

fun <T> T.displayTypeInfo(){
    val typeName = when(this){
        is String -> "это String"
        is Int -> "это Int"
        else
            ->"this type {$this} unknown "
    }
    println(typeName)
}
fun main(){
    3.displayTypeInfo()
    "a".displayTypeInfo()
    true.displayTypeInfo()
    println("Введите значение:")
    val input = readLine()

    if (input != null) {
        val intInput = input.toIntOrNull()

        when {
            intInput != null -> intInput.displayTypeInfo()
            else -> input.displayTypeInfo()
        }
    } else {
        println("Нет ввода")
    }
}