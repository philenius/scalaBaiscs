package de.scala.basics

import de.scala.basics.{Car, CarPark}

object App {

  def main(args: Array[String]): Unit = {

    val carPark = new CarPark(10)
    val c1 = new Car()
    val c2 = new Car()

    println(carPark.getFreeParkingSlots)
    println(carPark.getContainedVehicleCount)

    carPark.driveIn(c1)
    println(carPark.getFreeParkingSlots)
    println(carPark.getContainedVehicleCount)

    carPark.driveIn(c2)
    println(carPark.getFreeParkingSlots)
    println(carPark.getContainedVehicleCount)

    carPark.driveOut(c1)
    println(carPark.getFreeParkingSlots)
    println(carPark.getContainedVehicleCount)

  }

}
