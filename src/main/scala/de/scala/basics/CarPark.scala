package de.scala.basics

import scala.collection.mutable.ListBuffer

class CarPark(capacity: Int) {

  private var vehicleList: ListBuffer[Vehicle] = ListBuffer()

  def getFreeParkingSlots(): Int = this.capacity - this.vehicleList.length

  def getContainedVehicleCount(): Int = this.vehicleList.length

  def driveIn(v: Vehicle): Unit = {
    if (getFreeParkingSlots == 0) {
      throw new NoFreeParkingSlotsException
    }
    vehicleList += v
  }

  def driveOut(v: Vehicle): Unit = {
    if (!vehicleList.contains(v)) {
      throw new NoSuchElementException
    }
    vehicleList -= v
  }

}
