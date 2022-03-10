import scala.annotation.tailrec

object EulerProblem003 {

  def testAnswer(anAnswer: Long): Unit = {
    var knownAnswer = 6857
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
    if (n == 1) {
      return true
    } else if (n == 0) {
      return false
    }

    if (n % 2 == 0) {
      return false
    }

    return isPrimeUglyVersionRecursive(n%2)
  }

  // What is the largest prime factor of the number 600851475143L ?
  def main(args: Array[String]): Unit = {
    var target = 600851475143L
    var answer = 0L
    var i = 0L
    var isFactor = false
    var isPrime = false

    i = target / 2 - 1 // half target to count backwards
    answer = 0L
    while (answer == 0) {
      i -= 1
      isFactor = target % i == 0
      if (i % 10000000001L == 0) {
        println("(" + i + ") isFactor(" + isFactor + ") isPrime(" + isPrimeUglyVersionRecursive(i) + ")")
      }
      if (isFactor) {
        println("(" + i + ") isFactor(" + isFactor + ") isPrime(" + isPrimeUglyVersionRecursive(i) + ")")
        if (isPrimeUglyVersionRecursive(i)) {
          answer = i
        }
      }

      // Bail. To be removed.
      if (i < 3) {
        answer = -1
      } else if (answer==0 && isFactor && isPrimeUglyVersionRecursive(i)) {
        println("Burp")
        answer = i
      }
    }

    testAnswer(answer)
  }
}

