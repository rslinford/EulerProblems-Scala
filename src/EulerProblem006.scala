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
    var knownAnswer = 25164150
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
    var answer = 20
    var i = 0
    var a = 0
    var b = 0

    while (!isSomeTest(answer)) {
      answer += 1
      if (answer % 7000001 == 0) {
        println("anAnswer(" + answer + ")")
      }
    }

    testAnswer(answer)
  }

}
