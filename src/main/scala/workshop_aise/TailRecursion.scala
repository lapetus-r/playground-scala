package workshop_aise

object TailRecursion {

  def main(args: Array[String]) {

    @scala.annotation.tailrec
    def count(value: Int, remaining: Seq[String]): Int = {
      remaining match {
        case head :: tail if head.length == 5 => count(value + 1, tail)
        case _ :: tail => count(value, tail)
        case Nil => value
      }
    }

    println(count(0, Seq("brett", "jerry", "kevin", "bro")))

  }

}
