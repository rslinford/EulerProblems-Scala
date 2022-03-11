object EulerProblem006 {
  /*
  The sum of the squares of the first ten natural numbers is,
           1^2 + 2^2 + ... + 10^2 = 385
  The square of the sum of the first ten natural numbers is,
           (1 + 2 + ... + 10)^2 = 55^2 = 3025
  Hence the difference between the sum of the squares of the
  first ten natural numbers and the square of the sum is,
            3025 - 385 = 2640
  Find the difference between the sum of the squares of the first
  one hundred natural numbers and the square of the sum.

  Answer:  25164150
  */
  def testAnswer(anAnswer: Long): Unit = {
    val knownAnswer = 25164150
    println("anAnswer(" + anAnswer + ") knownAnswer(" + knownAnswer + ")")
    if (anAnswer == knownAnswer) {
      println("Yay!")
    }
    else {
      println("Rats!")
    }
  }

  def isSomeTest(n: Int): Boolean = {
    var isDone = false
    var isPass = false
    while (!isDone) {
      isDone = true
      isPass = true
    }
    isPass
  }

  def main(args: Array[String]): Unit = {
    var answer = 0
    var i = 0
    var baseSum = 0
    var powerSum  = 0

    for (i <- 1 to 100) {
      baseSum += i
      powerSum += i * i
      println("i(" + i + ") anAnswer(" + answer + ") baseSum(" + baseSum + ") powerSum(" + powerSum + ")")
    }

    answer = baseSum * baseSum - powerSum
    testAnswer(answer)
  }

}
