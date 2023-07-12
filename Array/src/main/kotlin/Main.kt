fun main() {
    val num = arrayOf(1,2,3,4,5)           // integer array of elements 1,2,3,4,5
    val num1 = arrayOf<Int>(6,7,8,9,0)     // <Int> datatype is declared
    val str = arrayOf("a","e","i","o","u") // Character array of Elements a,e,i,o,u
    num[3]=9 // Assigning a value in array
    println(num[3]);
    println("Length of array num: ${num.size} ")
    val newList = listOf<Int>(11,12,13,14,15)  //immutable list
    val newList2 = mutableListOf<Int>(16,17,18,19,20) //mutable list
    newList2.add(2,30) // Addd a new element in specific index
    println(newList2[2])
    newList2.removeAt(4) //Remove the value at the given Index
    newList2.remove(20) // Remove the give element
    newList2.replaceAll { 99 }  // replace every element to 99
    newList2.sort()
    println(newList2[0])


}