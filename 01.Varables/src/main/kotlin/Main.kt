fun main() {
    // Arthemetic Operation
    val photos = 100
    var delected = 90
    println("You have $photos photos in your galary.")
    println("You have $delected delected photoes in your galary.")
    println("You have ${photos-delected } remaining photoes in your galary.\n")

    // String operations
    val nextMeeting = "Next meeting :"
    val date = "january 01"
    val reminder: String = "First Method : " + nextMeeting + " " + date + "At work"
    val reminder2 ="Second Method : $nextMeeting $date At work \n"
    println(reminder + "\n" +reminder2)

    // Boolean Operation
    var notificationEnabled : Boolean = false
    println("Are notification enabled ? $notificationEnabled \n")

}