package de.scala.basics

import scala.collection.mutable.ListBuffer

class CarPark(capacity: Int) {

  private var vehicleList: ListBuffer[Vehicle] = ListBuffer()

  def getFreeParkingSlots(): Int = ???

  def getContainedVehicleCount(): Int = ???

  def driveIn(v: Vehicle): Unit = ???

  def driveOut(v: Vehicle): Unit = ???

}
