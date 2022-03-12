import scala.annotation.tailrec

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

  def main(args: Array[String]): Unit = {
    var answer = 0L
    testAnswer(answer)
  }

}
