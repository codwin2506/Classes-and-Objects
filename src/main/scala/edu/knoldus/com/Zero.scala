package edu.knoldus.com

import scala.sys.error

object Zero extends Nat {
  def isZero: Boolean = true
  def predecessor: Nat = error("negative number")
  def successor: Nat = new Succ(this)
  def +(that: Nat): Nat = that
  def -(that: Nat): Nat = if (that.isZero) Zero else error("negative number")
}