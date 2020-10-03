package workshop_aise

object Implicit {

  implicit class ImplicitString2(val _input: String) {
    def +++(s: String): String = s ++ _input

    def containsAA: Boolean = _input.contains("AA")

    def curring(implicit s: String): String = s ++ _input
  }

  implicit class L(val l: List[String]) {
    def +++(e: String): String = if (l.contains(e)) e.toUpperCase else ""

    def containsIgnoreCase(e: String): Boolean = l.map(_.toUpperCase).contains(e.toUpperCase)
  }

  implicit val s: String = "T3K"

  def main(args: Array[String]) {
    println("Hello" ++ "T3K")
    println("Hello" +++ "T3K")

    println(List("brett", "jerry", "kevin") +++ "kevin")
    println(List("brett", "jerry", "kevin") contains "KEVIN")
    println(List("brett", "jerry", "kevin") containsIgnoreCase "KEVIN")
  }
}
