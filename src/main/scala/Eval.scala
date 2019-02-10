/**
  * Created by mtumilowicz on 2019-02-10.
  */
object Eval {
  def eval[A, B](f: A => B, a: A): B = f apply a
}
