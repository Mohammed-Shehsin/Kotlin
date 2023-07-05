import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    println("How many steps did you go today ? \n")
    val step :Long = scanner.nextLong()
    calorieMetre(step)
    println("how many step was your goal ? \n")
    val desiredStep : Long = scanner.nextLong()
    desiredCalories(desiredStep,step)
}


fun calorieMetre( step : Long) {
    val burned = step / 25
    println("Congrats you burned $burned calories \n")
}
fun desiredCalories(desiredStep : Long = 0 ,step :Long) {
    val remaingStep = desiredStep - step
    println("So closed you needed just $remaingStep more steps \n")
}

