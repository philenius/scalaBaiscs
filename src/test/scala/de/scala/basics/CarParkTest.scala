package de.scala.basics

import org.scalatest.{FlatSpec, Matchers}

class CarParkTest extends FlatSpec with Matchers {

  "A new car park" should "contain 0 vehicles" in {
    val carPark = new CarPark(100)
    carPark.getContainedVehicleCount() should be(0)
  }

  "In a new car park" should "all parking slots be free" in {
    val capacity = 50
    val carPark = new CarPark(capacity)
    carPark.getFreeParkingSlots() should be(capacity)
  }

  "The car park" should "throw a NoSuchElementException if a car wants to drive out but didn't drive in before" in {
    val carPark = new CarPark(120)
    a[NoSuchElementException] should be thrownBy {
      carPark.driveOut(new Car)
    }
  }

  "The number of free parking slots" must "decrease when a car drives in" in {
    val capacity = 75
    val carPark = new CarPark(capacity)
    carPark.driveIn(new Car)
    carPark.getFreeParkingSlots() should be(capacity - 1)
  }

  it must "increase when a car drives out" in {
    val capacity = 25
    val carPark = new CarPark(capacity)
    carPark.driveIn(new Car)
    carPark.getFreeParkingSlots() should be(capacity - 1)
  }

  "The car park" should "throw a NoFreeParkingSlotsException when its capacity is reached" in {
    val capacity = 3
    val carPark = new CarPark(capacity)
    carPark.driveIn(new Car)
    carPark.driveIn(new Car)
    carPark.driveIn(new Car)
    a[NoFreeParkingSlotsException] should be thrownBy {
      carPark.driveIn(new Car)
    }
  }


}
