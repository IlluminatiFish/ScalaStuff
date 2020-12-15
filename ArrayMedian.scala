object ArrayMedian {

  def main(args: Array[String]) { // Defines main driver code function just like in python

    // TO-DO: Allow for user's to enter their own sequence of values
    
    val set1 = Seq(3, 5, 11, 10, 19) // Our testing sequence of numbers

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
    val r = medianCalculator(set1) // Calculate the median of the sequence we defined
    println(r) // Print the median of the sequence we supplied

  }
}
