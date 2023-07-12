fun main() {
    var a : String? = "abc"  // '?' it is used for null safety.
    a = null
    var nullLength = a?.length   //null safety.
    println(a)
    println("Null length is : $nullLength .")
}