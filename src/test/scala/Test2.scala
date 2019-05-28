import org.scalatest.{FlatSpec, Matchers}

class Test2 extends FlatSpec with Matchers {
  "y" should "be 8 " in {
    assert(my.App2.y == 8)
  }
}
