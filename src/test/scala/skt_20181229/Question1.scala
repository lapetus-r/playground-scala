package skt_20181229

import org.junit.Test

class Question1 {

  @Test
  def test(): Unit = {
    println(solution(Array(1, 4, -1, 3, 2)))
    println(solution(Array(1, 6, 4, 2, -1, 4, 3)))
  }

  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    var idx = 0
    var cnt = 0
    do {
      idx = a(idx)
      cnt += 1
    } while (idx != -1)

    cnt
  }

}
