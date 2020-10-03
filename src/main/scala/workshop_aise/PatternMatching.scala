package workshop_aise

import scala.collection.immutable.Map

object PatternMatching {

  case class AISEWorkshop(private val agenda: String = "scala_features",
                          private val dt: Int = 20200803) {
    val attendees: List[String] = List("brett", "jerry", "kevin", "etc")
    val Presenters: Map[String, Int] = Map.empty[String, Int]
  }

  def main(args: Array[String]) {
    Seq("ONE", 1, 2, 2.7, Option(1), Option("TEST"), AISEWorkshop()) map {
      case "ONE" => "one!!"
      case i if 1 to 10 contains i => "int " + i
      case d: Double => "a double: " + d
      case AISEWorkshop("scala_features", 20200802) => "AISEWorkshop_20200802"
      case AISEWorkshop(_, 20200803) => "AISEWorkshop_20200803"
      case AISEWorkshop => "AA"
      case Some(v) => v
      case v => "unexpected value: " + v
    } foreach println

  }

}
