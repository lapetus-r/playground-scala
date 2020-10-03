package workshop_aise

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object ForComprehension {
  def main(args: Array[String]) {
    val lll = List(
      List(List(1, 2, 3, 4), List(11, 22, 33, 44)),
      List(List(111, 222, 333, 444), List(1111, 2222, 3333, 4444))
    )

    // flatMap
    lll.flatMap {
      _.filter(_ != List(1, 2, 3, 4)).flatMap {
        _.map(_ * 2)
      }
    }

    // for comprehension
    for {
      ll <- lll
      l <- ll
      result <- l
    } yield result

    val fff = Future(Future(Future(1000)))

    // flatMap
    val fmResult = fff.flatMap {
      _.flatMap(i => i).map {
        ii => ii * 2
      }
    }
    Await.result(fmResult, 10.seconds)

    // for comprehension
    val fcResult = for {
      ff <- fff
      f <- ff
      result <- f
    } yield result

    Await.result(fcResult, 10.seconds)
  }

}
