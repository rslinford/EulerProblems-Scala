object EulerProblem010 {
  /*
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    Find the sum of all the primes below two million.

  Answer: 142913828922
  */
  def testAnswer(anAnswer: Long): Unit = {
    val knownAnswer = 142913828922L
    println("anAnswer(" + anAnswer + ") knownAnswer(" + knownAnswer + ")")
    if (anAnswer == knownAnswer) {
      println("Yay!")
    }
    else {
      println("Dang-it.")
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
    var answer = 0L
    var sumOfPrimes = 0L
    var isPrime = false
    var primeCount = 0
    val ALL_PRIMES_BELOW = 2000000L

    for (potentialPrime <- 2L to ALL_PRIMES_BELOW-1L) {
      isPrime = isPrimeUglyVersion(potentialPrime)
      if (isPrime) {
        primeCount += 1
        sumOfPrimes += potentialPrime
        if (primeCount%1000 == 0) {
          println("potentialPrime(" + potentialPrime + ") primeCount(" + primeCount + ") sumOfPrimes(" + sumOfPrimes + ")")
        }
      }
    }

    answer = sumOfPrimes
    testAnswer(answer)
  }
}
