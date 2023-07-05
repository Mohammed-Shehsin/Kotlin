import java.util.Scanner
val scanner = Scanner(System.`in`)

fun main() {
    greet("Chatty bot",2023)
    remindName()
    guessAge()
}

fun greet(assistantName : String , birthYear :Int){
    println("Hello! My name is $assistantName.\nI was created in $birthYear.")
}
fun getName(): String {
    return scanner.next()
}
fun remindName() {
    println("Please, remind me your name .")
    val name = getName()
    println("What a great name you have, $name!")
}
fun findAge(rem3 : Int ,rem5 : Int ,rem7 :Int):Int{
    return (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
}
fun guessAge(){
    println("Let me guess your age.\nEnter reminders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = findAge(rem3,rem5,rem7)
    println("Your age is $age; that's a good time to start programming!")
}
