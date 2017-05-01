package de.opitz.bigdata.scala.test

import de.opitz.bigdata.scala._
import org.scalatest.{FlatSpec, Matchers}

class CarTest extends FlatSpec with Matchers {

  "A car" should "have a default weight of 1000 kg and a maximum speed of 180 km/h" in {
    val car = new Car()
    car.weight should be(1000)
    car.maxSpeed should be(180)
  }

  it should "make the sound vroom, vroom" in {
    val car = new Car()
    car.makeSound() should be("vroom, vroom")
  }

}
