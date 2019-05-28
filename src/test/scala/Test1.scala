import org.scalatest.{FlatSpec, Matchers}

class Test1 extends FlatSpec with Matchers {
  "x" should "be 9 " in {
    assert(my.App1.x == 9)
  }
}
