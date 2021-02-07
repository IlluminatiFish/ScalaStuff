import scala.collection.mutable.ArrayBuffer


/**
 *
 * A scala object that allows you to calculate the mean,
 * of an array supplied by a user's input.
 *
 */

object ArrayMean {
	
	/**
	 *
	 * A built-in function that runs the code supplied,
	 * inside of it, like seen in C++ & C.
	 *
	 */

	def main(args: Array[String]) { 
		val input = scala.io.StdIn.readLine("[+] How many values do you have? ") 
		var array = ArrayBuffer[Float]() 


		for(value <- 0 to input.toInt - 1) { 
			val num = scala.io.StdIn.readLine("[+] Enter value #" + (value + 1) + ": ") 
			array += num.toFloat 

		}
		var mean = array.sum / input.toFloat
		println(mean)

	}
}
