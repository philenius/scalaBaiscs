package de.scala.basics

class NoFreeParkingSlotsException(message: String) extends Exception(message) {

  def this() {
    this("")
  }

}
