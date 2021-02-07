import scala.collection.mutable.ArrayBuffer


/**
 *
 * A scala object that allows you to calculate the median,
 * of an array supplied by a user's input.
 *
 */

object ArrayMedian {
	
	/**
	 *
	 * A built-in function that runs the code supplied,
	 * inside of it, like seen in C++ & C.
	 *
	 */
	def main(args: Array[String]) { 

		val input = scala.io.StdIn.readLine("[+] How many values do you have? ") 
		var array = ArrayBuffer[Int]()


		for(value <- 0 to input.toInt - 1) { 
			val num = scala.io.StdIn.readLine("[+] Enter value #" + (value + 1) + ": ") 
			array += num.toInt

		}

		/**
		 *
		 * A function that finds the median,
		 * of array supplied by a user's input.
		 *
		 */

		def medianCalculator(seq: Seq[Int]): Int = {
			val sortedSeq = seq.sortWith(_ < _) 
			if (seq.size % 2 == 1) { 
				sortedSeq(sortedSeq.size / 2)
			}
			else { 
				val (up, down) = sortedSeq.splitAt(seq.size / 2) 
				(up.last + down.head) / 2
				
			}
		}
		val median = medianCalculator(array)
		println(median) 

	}
}
