package skt_20181218

object Question2 {

  def main(args: Array[String]) {
    println(solution("SMS messages ar really short"))
  }

  def solution(s: String): Int = {
    // write your code in Scala 2.12
    val max = s.toUpperCase.distinct.length
    def tailRecFunction(input: String, cnt: Int): Int = input.take(max).lastIndexOf(" ") match {
      case -1 => cnt
      case m => tailRecFunction(input.drop(m + 1), cnt + 1)
    }

    tailRecFunction(s, 0)

  }

}
