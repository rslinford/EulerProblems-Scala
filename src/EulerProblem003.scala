object EulerProblem003 {
  def sumDivisibleBy(n: Int, target: Int): Int = {
    var p = target / n
    return n * (p * (p + 1)) / 2
  }

  def main(args: Array[String]) = {
    var target = 999
    var answer = (sumDivisibleBy(3, target) + sumDivisibleBy(5, target) - sumDivisibleBy(15, target))
    println("Answer Euler 001: " + answer)
  }
}

