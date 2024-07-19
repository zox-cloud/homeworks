
import java.util.*
import kotlin.math.pow




fun main() {
    val sc = Scanner(System.`in`);
    val number = sc.nextInt();
    val exponent = sc.nextInt();
    number.pow(exponent){
        result -> println(result)
    }

}
fun Int.pow(exponent: Int , resultLymbda:(Int) -> Unit) {
    val result = this.toDouble().pow(exponent).toInt();
    resultLymbda(result);
}