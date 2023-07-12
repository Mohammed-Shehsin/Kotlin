import kotlin.math.absoluteValue
import java.util.Scanner

val scanner = Scanner(System.`in`)

fun reverseInt(value: Int): Int {
    var num = value
    var reversed = 0

    // Reversing the integer using a while loop
    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    return reversed
}

fun main() {
    print("Give me the number to be Reversed : ")
    val value = scanner.nextInt()
    val reversedValue: Int = if (value < 0) {
        // Reverse the absolute value and add the sign back
        -1*reverseInt(value.absoluteValue)
    } else {
        // Reverse the value as is
        reverseInt(value)
    }

    println("Original value: $value")
    println("Reversed value: $reversedValue")
}
