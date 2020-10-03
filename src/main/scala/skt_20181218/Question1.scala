package skt_20181218

object Question1 {

  def main(args: Array[String]) {
    val x = Array(0.00, 0.2, 0.33, 0.43, 0.63, 0.66, 1.00)
    val y = Array(0.00, 0.25, 0.25, 0.50, 0.50, 1.00, 1.00)
    println(solution(x, y))
  }

  def solution(x: Array[Double], y: Array[Double]): Double = {
    // write your code in Scala 2.12
    var area = 0.0
    for (i <- 0 until x.length - 1) {
      area += ((x(i + 1) - x(i)) * (y(i + 1) - y(i)) / 2) + ((x(i + 1) - x(i)) * y(i))
    }

    area
  }

}
