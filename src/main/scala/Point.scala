class Point(val x: Int, val y: Int) {

  override def toString = s"Point($x, $y)"

  def canEqual(other: Any): Boolean = other.isInstanceOf[Point]

  override def equals(other: Any): Boolean = other match {
    case that: Point =>
      (that canEqual this) &&
        x == that.x &&
        y == that.y
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(x, y)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

object Point {

  def apply(x:Int, y:Int):Point = new Point(x,y)

}

case class CPoint(x: Int, y: Int)

// 通常のクラスとケースクラスとでは、同値性に違いがある。
// ケースクラスで生成されたインスタンスは、別物であっても保持しているフィールドが同じであれば、
// 同値(インスタンスの実際のポインタが異なっていても同値)として扱われる。
// 逆に、「ケースクラスはオブジェクトでありながら、より値のようにプログラムの中で扱うことができる」と捉えることもできる。

// 通常のクラスで同値性の挙動を変更する場合には、hashCode() と equals() を overrideすることで実現できる。
// しかし、実際にはそういう場合、ケースクラスで代用すると思われる
