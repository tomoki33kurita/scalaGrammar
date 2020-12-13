object Match {
 def iniToName(num: Int): String = {
  num match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }
 }

  def message(msg: String): String = {
    msg match {
      case "good" | "bad" => "game"
    }
  }

  def patternMatch(): Unit = {
    val seq = Seq("A", "B", "C", "D", "E")
    seq match {
      case Seq("A", b, c, d, e) if b != "B" =>
        println("b = " + b)
        println("c = " + c)
        println("d = " + d)
        println("e = " + e)
      case _ =>
        println("nothing")
    }
  }

  def patternMatchNest(): Unit = {
    val seq = Seq(Seq("A"), Seq("B","C","D","E"))
    seq match {
      case Seq(a@Seq("A"), x) =>
        println(a)
        println(x)
      case _ => println("nothing")
    }
  }

  // AnyRef という型は、Scalaにおいて全てのオブジェクトが含まれる型... Seq == AnyRef, String == AnyRef, Seq != String
  def patternMatchType(): Unit = {
    val obj: AnyRef = "String Literal"
    obj match {
      case v: java.lang.Integer => println("Integer!")
      case v: String => println(s"String! length is ${v.length}")
    }
  }

  // パターンマッチではジェネリクスを認識してくれないので、Seqなどのジェネリクスがあるコレクションに対しては、
  // 以下のようにワイルドカード_を要素の型として指定するまでが限界
  def patternMatchGenerics(): Unit = {
    val obj: AnyRef = Seq("a","b","c")
    obj match {
      case v: Seq[_] => println("Seq[_]")
      case _ => println("nothing")
    }
  }

}