package de.opitz.bigdata.scala


class Car(var weight: Float = 1000, var maxSpeed: Float = 180) extends Vehicle(weight, maxSpeed) {

  override def makeSound(): String = "vroom, vroom"

}
