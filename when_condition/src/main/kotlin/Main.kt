fun main() {
    val trafficLightColor = "red"
    trafficLight(trafficLightColor)
    val num = 10
    isPrime(10)
}
fun trafficLight(color : String) {
    when(color){
        "red" -> println("Stop")
        "yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("$color not found !")
    }
}
fun isPrime(value : Int){
    when(value){
        2,3,5,7 -> println("$value is a prime number in between 0 and 10")
        else -> println("$value is not a prime number in between 0 and 10")
    }
}