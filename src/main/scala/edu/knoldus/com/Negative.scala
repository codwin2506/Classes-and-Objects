package edu.knoldus.com

object Negative extends Sign {
  def isPositive: Boolean = false
  def negate: Sign = Positive
}