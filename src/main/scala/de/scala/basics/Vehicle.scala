package de.scala.basics

abstract class Vehicle(weight: Float, maxSpeed: Float) {

  def drive(speed: Float): Unit = ???

  def makeSound(): String = {
    "no sound"
  }

}
