class FindCount() {

  private var lowerlimit = 0
  private var upperlimit = 0
  private var divisor = 0

  //FUNCTION TO TAKE LOWERLIMIT, UPPERLIMIT, DIVISOR FROM THE USER.
  def takingInputs(): Unit = {

    println("Enter the range from 1 to n and the divisor")

    println("Enter lowerlimit = ")
    lowerlimit = scala.io.StdIn.readInt()

    println("Enter upperlimit = ")
    upperlimit = scala.io.StdIn.readInt()

    println("Enter the divisor = ")
    divisor = scala.io.StdIn.readInt()

    try {
      if (upperlimit < lowerlimit) {
        throw new ArithmeticException("Lower limit cannot be greater than upper limit")
      }

    } catch {
      case exception: ArithmeticException => {
        println(exception.getMessage)

      }
    }
  }

    // FUNCTION TO COUNT THE TOTAL DIVISORS IN THE GIVEN RANGE.
  def countDivisor(): Unit = {

    var count = 0
    for (element <- lowerlimit to upperlimit) {

      if (element % divisor == 0) {
        count += 1
      }
    }
    println("Count is = " + count)

  }

}

object CountDivisor extends App {

  private val FindCount_object = new FindCount()


    FindCount_object.takingInputs()
    FindCount_object.countDivisor()

}
