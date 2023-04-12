import Integer.getInteger
import String.valueOf
import collection

class Fruit(val name: String) {
  def addFruit(fruit: Fruit, basket: List[Fruit]): List[String] = basket += fruit

  val fruitsList = List(Fruit("banana"), Fruit("kiwi"))
  def addFruit1(fruit: Fruit, basket: List[Fruit]): List[String] = basket += fruit

  val fruitsList1 = List(Fruit("banana"), Fruit("kiwi"))
  def addFruit2(fruit: Fruit, basket: List[Fruit]): List[String] = basket += fruit

  val fruitsList2 = List(Fruit("banana"), Fruit("kiwi"))
  def addFruit3(fruit: Fruit, basket: List[Fruit]): List[String] = basket += fruit

  val fruitsList3 = List(Fruit("banana"), Fruit("kiwi"))
  def addFruit4(fruit: Fruit, basket: List[Fruit]): List[String] = basket += fruit

  val fruitsList4 = List(Fruit("banana"), Fruit("kiwi"))
}