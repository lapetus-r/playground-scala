package skt_20181229

import org.junit.Test

class Question2 {

  @Test
  def test(): Unit = {
    println(solution("Forget  CVs..Save time . x x"))
    println(solution("We test coders. Give us a try?"))
    println(solution("   We    test    coders.    Give    us    a    try   ?  "))
  }

  def solution(s: String): Int = {
    // write your code in Scala 2.12
    var cnt = 0
    s.split("[.?!]") foreach { sentence =>
      val length = sentence.trim.replaceAll("\\s+", " ").split(" ").length
      if (length > cnt) cnt = length
    }

    cnt
  }

}
