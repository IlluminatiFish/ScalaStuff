import scala.collection.mutable.ArrayBuffer

object ArrayMedian {

  def main(args: Array[String]) { // Defines main driver code function just like in python

    val input = scala.io.StdIn.readLine("[+] How many values do you have? ") // Takes initial input on how many numbers the user wants
    var array = ArrayBuffer[Int]() // Create array buffer object that takes a float


    for(value <- 0 to input.toInt - 1) { // Iterate over the amount of numbers the user wants, aka keep asking for values until initial input value is satisfied
      val num = scala.io.StdIn.readLine("[+] Enter value #" + (value + 1) + ": ") // Asks for input from user
      array += num.toInt // Appends the numbers entered into the array buffer

    }

    def medianCalculator(seq: Seq[Int]): Int = {
      val sortedSeq = seq.sortWith(_ < _) // Sort the sequence we have given as the parameter to our function
      if (seq.size % 2 == 1) { // If the size of our sequence is odd
        sortedSeq(sortedSeq.size / 2) // Half the sequence size and find the value at that index
      }
      else { // If the size of our sequence is even
        val (up, down) = sortedSeq.splitAt(seq.size / 2) // Split the sequence into two subsequences
        (up.last + down.head) / 2 // Find the last number in subsequence 1 and find the first number in subsequence 2
        // and add them together then half them to get the median if the sequence size is even
      }
    }
    val r = medianCalculator(array) // Calculate the median of the sequence we defined
    println(r) // Print the median of the sequence we supplied

  }
}
