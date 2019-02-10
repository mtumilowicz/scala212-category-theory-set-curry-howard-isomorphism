import org.scalatest.{FunSuite, Matchers}

/**
  * Created by mtumilowicz on 2019-02-03.
  */
class EvalTest extends FunSuite with Matchers {

  test("eval") {
    def square = (i: Int) => i * i

    Eval.eval(square, -2) should be(4)
    Eval.eval(square, 1) should be(1)
    Eval.eval(square, 2) should be(4)
  }

}
