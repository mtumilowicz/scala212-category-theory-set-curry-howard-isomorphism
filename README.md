# scala212-category-theory-set-curry-howard-isomorphism
_Reference_: https://bartoszmilewski.com/2015/03/13/function-types/

# preface
* `Nothing` and `Unit` correspond to `false` and `true`
* product and sum (coproduct) correspond to logical conjunction (AND) and disjunction (OR)
* function type corresponds to logical implication `->`
* type `a->b` can be read as "if a then b"
* according to the **Curry-Howard isomorphism**, every type can be interpreted as a 
proposition — a statement or a judgment that may be `true` or `false`. 
* a proposition is considered `true` if the  type is inhabited and `false` if it isn’t
* a logical implication is `true` if the function type is inhabited (there exists a function of that type) 
* an implementation of a function is a proof of a theorem 
* writing programs is equivalent to proving theorems
* meaning of the absurd function
* `def absurd[A]: Nothing => A = _ => ???`
* `false ⇒ a`
* anything follows from falsehood
* the function absurd can never be called

# project description
We will provide implementation of function `eval` and show how it corresponds to logic.
* `eval :: ((a -> b), a) -> b`
* `eval :: (a⇒b) × a -> b`
* `((a ⇒ b) ∧ a) ⇒ b`
* it is _modus ponens_
* code in scala
    ```
    def eval[A, B](f: A => B, a: A) = f apply a
    ```
* and tests:
    ```
    def square = (i: Int) => i * i
    
    Eval.eval(square, -2) should be(4)
    Eval.eval(square, 1) should be(1)
    Eval.eval(square, 2) should be(4)
    ```