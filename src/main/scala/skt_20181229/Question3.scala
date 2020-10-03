package skt_20181229

object Question3 {

  def main(args: Array[String]) {
    println(solution(Array(2, 1, 3, 5, 4)))
    println(solution(Array(2, 3, 4, 1, 5)))
    println(solution(Array(1, 3, 4, 2, 5)))
    println(solution(Array(5, 3, 2, 1, 4)))
    println(solution(Array(3, 2, 1, 4, 5)))
    println(solution(Array(1, 2, 3, 4, 5)))
    println(solution(Array(5)))
  }

  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    var set = scala.collection.mutable.Set[Int]()
    var cnt = 0
    a.foreach { element =>
      set += element
      if ((1 until element).forall(set.contains)) cnt += 1
    }

    cnt
  }

}
