class Test {   // Regular Class
inner class TestInner(){ // Inner class

}
}
data class TestData(val num : Int){ // Data class

}
enum class TestEnum(){ // Enum Class

}
abstract class  TestAbstract(){ // Abstract Class

}
sealed class TestSealed(){ // Sealed Class

}
class BestClass(){ /// Regular Class named BestClass.
 val name = "Android"      //Here the variables and functions are default Public.
 fun printHello(){
  println("Hello $name !.")
 }
}
class WhoAreYou( val name : String ){
 fun print(){
  println("I am $name .")
 }
}
//-------------------------- Inheritance : ---------------------------
open class BaseClass ( num : Int){
 constructor( ) : this(name)
}
class DerivedClass(num: Int) : BaseClass() {
}

fun main() {
 val obj = Test() // Object of class Test
 val objBest = BestClass()  // Object of BestClass ()
 objBest.printHello()       // Calling the function printHello()
 println("Name is ${objBest.name}.") //Calling or accessing the variable in the class
 val person = WhoAreYou("Adam")
 person.print()
}