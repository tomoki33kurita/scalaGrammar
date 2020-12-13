class Dog(private val name: String) {
  def greet(): Unit = println(s"${name}だワン")
}

//object Pochi extends Dog("pochi")

object Dog {
  def apply(name: String): Dog = new Dog(name)

  def apply(id: Int): Dog = new Dog(s"番号付きの犬：${id}番")

  def printName(dog: Dog): Unit = println(dog.name)

}