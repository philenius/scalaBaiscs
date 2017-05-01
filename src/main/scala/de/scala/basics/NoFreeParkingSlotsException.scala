package de.opitz.bigdata.scala

class NoFreeParkingSlotsException(message: String) extends Exception(message) {

  def this() {
    this("")
  }

}
