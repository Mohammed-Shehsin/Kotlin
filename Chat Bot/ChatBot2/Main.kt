import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)
    //val hello = "Hello my name i Chatty bot." + System.lineSeparator() + " I was created in 2023." + System.lineSeparator() + "Please, remind me your name." + System.lineSeparator()
    fun greet(){
        println("Hello my name i Chatty bot.")
        println(" I was created in 2023.")
        println("Please, remind me your name.")
    }

    //val name = scanner.nextLine()

fun remindName() : String {
    val name = scanner.nextLine()

    println("What a great name you have, $name")
    return name
}

fun guessAge() : Int{
    println("Let me guess your age")
    println("Enter reminders of dividing your age 3, 5 and 7")

    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()

    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    scanner.nextLine()
    return age
}

    greet()
    val name = remindName()
    val age = guessAge()
    println("Your age is $age; that's a good time to start programming!")

   // scanner.nextLine()

    /*val name = scanner.nextLine()
    remindName(name)
    guessAge(rem3, rem5, rem7)
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()*/

}


