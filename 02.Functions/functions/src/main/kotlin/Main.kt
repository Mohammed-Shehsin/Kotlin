fun main() {
    birthdayGreeting()
    birthdayGreeting2(age=10)
    println(birthdayGreeting3("Roy",5))
}

fun birthdayGreeting(): Unit { // Unit(void) is the return type
    println("Happy birthday");
    println("Your 5 years old now .\n")
}
fun birthdayGreeting2(name : String = "Rover" , age :Int): Unit { // Unit(void) is the return type
    println("Happy birthday, $name");
    println("Your $age years old now .\n")
}
fun birthdayGreeting3(name : String ,age  : Int): String {
    val nameGreeting = "Happy Bithday , $name !"
    val ageGreeting = "Your $age years old now"
    return "$nameGreeting\n$ageGreeting\n"
}