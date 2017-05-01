package de.opitz.bigdata.scala

class MaxSpeedLimitExceededException(message: String) extends Exception(message) {

  def this() {
    this("")
  }

}
