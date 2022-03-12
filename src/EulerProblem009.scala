import scala.annotation.tailrec

object EulerProblem009 {
  /*
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
       a2 + b2 = c2
    For example:
       3^2 + 4^2
       9 + 16
       25
       5^2

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.

    Answer: 31875000
  */
  def testAnswer(anAnswer: Long): Unit = {
    val knownAnswer = 31875000
    println("anAnswer(" + anAnswer + ") knownAnswer(" + knownAnswer + ")")
    if (anAnswer == knownAnswer) {
      println("Yay!")
    }
    else {
      println("Rats!")
    }
  }

  def main(args: Array[String]): Unit = {
    var answer = 0L

    answer = -1
    testAnswer(answer)
  }

}
