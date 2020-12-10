import scala.collection.mutable.ArrayBuffer

object ArrayMedian {

  def main(args: Array[String]) { // Defines main driver code function just like in python
    val input = scala.io.StdIn.readLine("[+] How many values do you have? ") // Takes initial input on how many numbers the user wants
    var array = ArrayBuffer[Float]() // Create array buffer object that takes a float


    for(value <- 0 to input.toInt - 1) { // Iterate over the amount of numbers the user wants, aka keep asking for values until initial input value is satisfied
      val num = scala.io.StdIn.readLine("[+] Enter value #" + (value + 1) + ": ") // Asks for input from user
      array += num.toFloat // Appends the numbers entered into the array buffer

    }
    println(array.sum / input.toFloat) // Prints the total of the array buffer and divides by the amount of numbers given

  }
}
