package edu.knoldus.com

object Positive extends Sign {
  def isPositive: Boolean = true
  def negate: Sign = Negative
}