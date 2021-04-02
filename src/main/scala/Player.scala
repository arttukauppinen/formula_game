import scala.collection.mutable

trait Player {
  var scores = mutable.Buffer[Double]()
  val formula = new Car
  val name: String
  }

class Human(theName: String) extends Player {
  override val name: String = theName
}

class Bot extends Player {
  override val name: String = "Stupid Bot"
}





