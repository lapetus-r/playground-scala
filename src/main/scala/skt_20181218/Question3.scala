package skt_20181218

object Question3 {

  def main(args: Array[String]) {
    println(solution("ABAABCCBAAC"))
  }

  def solution(s: String): String = {
    // write your code in Scala 2.12
    def tailRefFunction(input: String): String = input.split("AA|BB|CC", 2) match {
      case result if result.size < 2 => result.mkString
      case result => tailRefFunction(result.mkString)
    }

    tailRefFunction(s)
  }

}
