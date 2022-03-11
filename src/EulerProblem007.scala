object EulerProblem007 {
  /*

  Answer:  xxx
  */
  def testAnswer(anAnswer: Long): Unit = {
    val knownAnswer = -1
    println("anAnswer(" + anAnswer + ") knownAnswer(" + knownAnswer + ")")
    if (anAnswer == knownAnswer) {
      println("Yay!")
    }
    else {
      println("Rats!")
    }
  }

  def isSomeTest(n: Int): Boolean = {
    var isDone = false
    var isPass = false
    while (!isDone) {
      isDone = true
      isPass = true
    }
    isPass
  }

  def main(args: Array[String]): Unit = {
    var answer = 0
    var i = 0
    answer = 123
    testAnswer(answer)
  }

}
