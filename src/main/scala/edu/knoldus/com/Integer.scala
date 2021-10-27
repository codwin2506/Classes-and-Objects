package edu.knoldus.com

case class Integer(elem: Nat, PosNeg: Sign = Positive) extends Nat with Sign {
  override def isZero: Boolean =elem.isZero

  override def predecessor: Nat =
       if (isZero)  Integer(elem.successor, Negative)
       else if (PosNeg.isPositive)  Integer(elem.predecessor, PosNeg)
       else  Integer(elem.successor, Negative)

  override def successor: Nat =
    if (isZero)  Integer(elem.successor, Positive)
    else if (PosNeg.isPositive)  Integer(elem.successor, PosNeg)
    else  Integer(elem.predecessor, Negative)

  override def +(that: Nat): Nat =
    if (isZero) that
    else if (PosNeg.isPositive) this.predecessor + that.successor
    else this.successor + that.predecessor

  override def -(that: Nat): Nat =
    if (that.isZero) this
    else that match {
              case Integer(value, sign) =>
              this +  Integer(value, sign.negate)
  }

  override def isPositive: Boolean = PosNeg.isPositive
  override def negate: Sign =  Integer(elem, PosNeg.negate)
}


