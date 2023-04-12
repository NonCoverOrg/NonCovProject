class Fruit(val name: String) {
  def addFruit(fruit: Fruit, basket: List[Fruit]): List[String] = basket += fruit

  val fruitsList = List(Fruit("banana"), Fruit("kiwi"))
}