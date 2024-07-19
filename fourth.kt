
fun <T> T.displayTypeInfo(){
    val typeName = when(this){
        is String -> "это String"
        is Int -> "это Int"
        is DataType -> this.displayDataTypeInfo()
        else
        ->"this type {$this} unknown "
    }
    if (typeName is String) {
        println(typeName)
    }
}

sealed class DataType{
    data class DoubleType(val value: Double) : DataType()
    object UnitType : DataType()
}

fun DataType.displayDataTypeInfo() :String{
    return when (this) {
        is DataType.DoubleType -> "это DoubleType со значением ${this.value}"
        is DataType.UnitType -> "это Unit"

    }

}
fun main() {
    3.displayTypeInfo()
    "a".displayTypeInfo()
    true.displayTypeInfo()
    DataType.DoubleType(1.4).displayTypeInfo()
    DataType.UnitType.displayTypeInfo()
}
