import java.util.Scanner
val scanner = Scanner(System.`in`)

fun main() {
    greet("Chatty bot",2023)
    remindName()
    guessAge()
    countNum()
    quiz()
}

fun greet(assistantName : String , birthYear :Int){
    println("Hello! My name is $assistantName.\nI was created in $birthYear.")
}
fun getName(): String {
    return scanner.next()
}
fun getNumber(): Int{
    return scanner.nextInt()
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
    val rem3 = getNumber()
    val rem5 = getNumber()
    val rem7 = getNumber()
    val age = findAge(rem3,rem5,rem7)
    println("Your age is $age; that's a good time to start programming!")
}
fun countNum(){
    println("Hy, I could able to count numbers.\nGimme a number :")
    val count = getNumber()
    for (num in 1..count){
        println("$num !")
    }
    println("How was it ??")

}
fun quiz(){
    println("Lets do a Quiz game ..")
    do {
        println(
            "What is the chemical symbol for the element gold?\n" + "" +
                    "A)Ag\n" +
                    "B) Au\n" +
                    "C) Gd\n" +
                    "D) Pt"
        )
        var answer = getName().lowercase()
        if(answer!="b"){
            println("Your answer is Wrong try again...")
        }
    }while(answer!="b")
    println("Your Correct ! Congrats.")

}
