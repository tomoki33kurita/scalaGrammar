trait Greeter {
  def greet(): Unit
}

trait Robot {
  self: Greeter => // 自分型アノテーション

  def start(): Unit = greet()
  override final def toString() = "Robot"

}

