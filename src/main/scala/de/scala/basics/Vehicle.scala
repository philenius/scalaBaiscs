package de.opitz.bigdata.scala

abstract class Vehicle(weight: Float, maxSpeed: Float) {

  def drive(speed: Float): Unit = {
    if (speed > this.maxSpeed) {
      throw new MaxSpeedLimitExceededException
    }
  }

  def makeSound(): String = {
    "no sound"
  }

}
