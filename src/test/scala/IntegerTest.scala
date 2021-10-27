import edu.knoldus.com.{Succ, Zero}
import org.scalatest.funsuite.AnyFunSuite

class IntegerTest extends AnyFunSuite{
    val zero=Zero
    val one=new Succ(zero)
    val two=new Succ(one)

  test("Testing the zero as a object "){
    assert(zero.isZero==true)
    //assert(zero.predecessor.isZero=="negative number")
    assert(zero.successor.isZero==false)
    assert(zero.+(zero).isZero==true)
    assert(zero.-(zero).isZero==true)
  }
  test("Testing the Integers "){
    assert(zero.isZero==true)
    assert(two.predecessor.predecessor.isZero==true)
    assert(one.successor.predecessor.isZero==false)
    assert(one.+(zero).isZero==false)
    assert(two.-(two).isZero==true)
  }


  test("Testing the one object "){
    assert(one.isZero==false)
    assert(one.successor.isZero==false)
    assert(one.+(one).isZero==false)
    assert(one.-(one).isZero==true)
  }
}
