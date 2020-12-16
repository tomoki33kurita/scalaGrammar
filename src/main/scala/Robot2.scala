trait Greeter2 {
  def greet(): Unit
}

// Robot.scala ファイルの記述と異なり、自分型を使っておらず、 Greeter2トレイとを直接参照している。
// 直接継承しているので、Robot2トレイトを使う側も、greet() を叩けてしまう。　←　隠蔽できてないから「密結合である」てきなことになる？
trait Robot2 extends Greeter2 {
  def start(): Unit = greet()
  override final def toString = "Robot2"
}


