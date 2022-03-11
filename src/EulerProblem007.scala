import scala.annotation.tailrec

object EulerProblem007 {
  /*
   By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
   we can see that the 6th prime is 13. What is the 10 001st prime number?

   Answer:  104743
  */
  def testAnswer(anAnswer: Long): Unit = {
    val knownAnswer = 104743
    println("anAnswer(" + anAnswer + ") knownAnswer(" + knownAnswer + ")")
    if (anAnswer == knownAnswer) {
      println("Yay!")
    }
    else {
      println("Rats!")
    }
  }

  @tailrec
  def isPrimeUglyVersionRecursive(n:Long): Boolean = {
    var p = 3L
    if (n == 1 || n == 0) {
      return false
    } else if (n == 2) {
      return true
    }

    if (n % 2 == 0) {
      return false
    }

    isPrimeUglyVersionRecursive(n%2)
  }

  def main(args: Array[String]): Unit = {
    var answer = 0
    var i = 0

    var primeCount = 0
    var candidatePrime = 0

    while (primeCount < 7) {
      candidatePrime += 1
      if (isPrimeUglyVersionRecursive(candidatePrime)) {
        primeCount += 1
        println("primeCount(" + primeCount + ") candidatePrime(" + candidatePrime + ")")
      }
    }
    answer = candidatePrime

    testAnswer(answer)
  }

}
