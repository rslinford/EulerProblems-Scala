object EulerProblem004 {

  def testAnswer(anAnswer: Long): Unit = {
    var knownAnswer = 906609
    println("anAnswer(" + anAnswer + ") knownAnswer(" + knownAnswer + ")")
    if (anAnswer == knownAnswer) {
      println("Yay!")
    }
    else {
      println("Rats!")
    }
  }

  /*
    A palindromic number reads the same both ways. The largest palindrome
    made from the product of two 2-digit numbers is 9009 = 91 × 99.  Find
    the largest palindrome made from the product of two 3-digit numbers.
   */
  def main(args: Array[String]): Unit = {
    var answer = 0
    var i = 0

    i = 0
    answer = 0
    while (answer == 0) {
      answer = 1234
    }
    testAnswer(answer)
  }
}

