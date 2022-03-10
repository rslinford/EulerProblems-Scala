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

  def isPalandromeTest(n: Int): Boolean = {
    var s = ""
    var frontIndex = 0
    var backIndex = 0

    // A single digit is always palandrome
    if (n < 10) return true

    s = n.toString
    frontIndex = 0
    backIndex = s.length - 1
    if (s.charAt(frontIndex) != s.charAt(backIndex)) return false
    while (backIndex > frontIndex) {
      backIndex -= 1
      if (frontIndex == backIndex) return true
      frontIndex += 1
      if (frontIndex == backIndex) return true
      if (s.charAt(frontIndex) != s.charAt(backIndex)) return false
    }
    true
  }

  /*
    A palindromic number reads the same both ways. The largest palindrome
    made from the product of two 2-digit numbers is 9009 = 91 × 99.  Find
    the largest palindrome made from the product of two 3-digit numbers.
   */
  def main(args: Array[String]): Unit = {
    var answer = 0
    var i = 0
    var a = 0
    var b = 0
    var prod = 0
    var isPalandrome = false

    i = 0
    answer = 0
    for (a <- 1 to 999; b <- 1 to 999) {
      prod = a * b
      isPalandrome = isPalandromeTest(prod)
      if (isPalandrome){
        if (prod > answer) answer = prod
        println("a(" + a + ") X b(" + b +") = prod(" +  prod + ") isPalandrome(" + isPalandrome + ") answer(" + answer + ")")
      }
    }

    testAnswer(answer)
  }
}

