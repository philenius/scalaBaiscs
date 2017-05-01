package de.scala.basics

class MaxSpeedLimitExceededException(message: String) extends Exception(message) {

  def this() {
    this("")
  }

}
