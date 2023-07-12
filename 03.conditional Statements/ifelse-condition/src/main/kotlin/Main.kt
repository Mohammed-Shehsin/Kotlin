fun main() {
   val trafficLightColor = "red"
    if(trafficLightColor == "red"){   // If the condition is true it will run the body inside the {}
        println("Stop")
    }else if(trafficLightColor == "yellow"){ // If above condition is false and this given condition is true then run code inside {}
       println("yellow")
    }else{
        println("Go")                // if both conditions are false
    }
}
