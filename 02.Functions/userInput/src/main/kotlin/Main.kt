import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    val name : String = scanner.next()
    birthdayGreeting(name,10)
}

fun birthdayGreeting(name : String = "Rover" , age :Int): Unit { // Unit(void) is the return type
    println("Happy birthday, $name");
    println("Your $age years old now .\n")
}