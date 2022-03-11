object EulerProblem005 {

  def testAnswer(anAnswer: Long): Unit = {
    var knownAnswer = 232792560
    println("anAnswer(" + anAnswer + ") knownAnswer(" + knownAnswer + ")")
    if (anAnswer == knownAnswer) {
      println("Yay!")
    }
    else {
      println("Rats!")
    }
  }

  def isEvenlyDivisible20Test(n: Int): Boolean = {
    var factor = 20
    var isDone = false
    var isPass = false
    while (!isDone && factor > 1) {
      if (n % factor != 0) {
        isDone = true
        isPass = false
      }
      factor -= 1
      if (factor == 1) {
        isDone = true
        isPass = true
      }
    }

    isPass
  }


  /*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10
    without any remainder. What is the smallest positive number that is evenly divisible
    by all of the numbers from 1 to 20?
   */
  def main(args: Array[String]): Unit = {
    var answer = 20
    var i = 0
    var a = 0
    var b = 0

    while (!isEvenlyDivisible20Test(answer)) {
      answer += 1
      if (answer % 7000001 == 0) {
        println("anAnswer(" + answer + ")")
      }
    }

    testAnswer(answer)
  }
}

