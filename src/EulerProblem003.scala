object EulerProblem003 {

  // What is the largest prime factor of the number 600851475143 ?
  def main(args: Array[String]) = {
    var target = 600851475143L
    var answer = 0
    var i = 0L
    while (answer == 0) {
      i += 1;
      println("(" + i + ") ")
      if (i == 100) {
        answer = -1
      }
    }
    println("6857 Answer Euler 001: " + answer)
  }
}

