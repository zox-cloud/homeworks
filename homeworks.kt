
import java.util.Scanner
import kotlin.math.pow

fun Int.pow(exponent: Int): Int {
    if(exponent ==0 ) return 1
    return this.toDouble().pow(exponent).toInt();
}

fun main(){
    val sc = Scanner(System.`in`)
    println("Enter number")
    val number = sc.nextInt()
    println("Enter exponent number")
    val exponent = sc.nextInt()
    val result = number.pow(exponent)
    println(result)
}