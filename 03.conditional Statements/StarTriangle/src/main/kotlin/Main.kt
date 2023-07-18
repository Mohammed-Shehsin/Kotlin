import java.util.*
val scanner = Scanner(System.`in`)
fun main() {
    println("Enter the number of rows : ")
    val row = scanner.nextInt()
    printTriangle(row)

}
fun printTriangle(count: Int){
    for (i in 1..count) {
        for (j in 1..count - i) {
            print(" ")
        }
        for (k in 1..i) {
            print("*")
            if (k < i) {
                print(" ")
            }
        }
       println()
    }
}