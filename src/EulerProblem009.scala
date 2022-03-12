import scala.annotation.tailrec

object EulerProblem009 {
  /*
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
       a2 + b2 = c2
    For example:
       3^2 + 4^2 = 5^2

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
      println("Dang-it.")
    }
  }

  def isATripletTest(a:Int, b:Int, c:Int): Boolean = {
    a*a + b*b == c*c
  }

  def isTheTripletTest(a:Int, b:Int, c:Int): Boolean = {
    a + b + c == 1000
  }

  def main(args: Array[String]): Unit = {
    val TARGET_SUM = 1000
    var answer = 0L
    var a = 1
    var b = 2
    var c = 3
    var isATriplet = false
    var isTheTriplet = false

    while(a <= TARGET_SUM && answer == 0) {
      isATriplet = isATripletTest(a,b,c)
      if (isATriplet) {
        isTheTriplet = isTheTripletTest(a,b,c)
        if (isTheTriplet) {
          answer = a * b * c
          println("a(" + a + ") b(" + b + ") c(" + c + ") answer(" + answer + ")")
        }
      }

      // Advance the 3 counters
      c += 1
      if (c >= TARGET_SUM) {
        b += 1
        c = b + 1
        if (b >= TARGET_SUM) {
          a += 1
          b = a + 1
          c = b + 1
        }
      }
    }
    testAnswer(answer)
  }

}
