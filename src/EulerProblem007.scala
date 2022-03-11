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

  def isPrimeUglyVersionHelper(n:Long): Boolean = {
    var potentialFactor = n
    while (potentialFactor > 2) {
      potentialFactor -= 1
      // Return false if factor is found
      if (n % potentialFactor == 0) {
        // A factor was found therefore not prime.
        return false
      }
    }
    // No factors found. It's prime.
    true
  }

  def isPrimeUglyVersion(n:Long): Boolean = {
    var p = 0L
    var isPrime = false

    if (n == 1 || n == 0) {
      return false
    } else if (n == 2 || n == 3) {
      return true
    }

    // Test is even
    if (n % 2 == 0) {
      return false
    }

    isPrime = isPrimeUglyVersionHelper(n)
    if (isPrime) {
      return true
    }

    if (isPrime) {
      return true
    }

    isPrime
  }

  def main(args: Array[String]): Unit = {
    var answer = 0
    var i = 0

    var primeCount = 0
    var candidatePrime = 0

    while (primeCount < 10001) {
      candidatePrime += 1
      if (isPrimeUglyVersion(candidatePrime)) {
        primeCount += 1
        if (primeCount < 10 || primeCount % 1000 == 0) {
          println("primeCount(" + primeCount + ") candidatePrime(" + candidatePrime + ")")
        }
      }
    }
    answer = candidatePrime

    testAnswer(answer)
  }

}
