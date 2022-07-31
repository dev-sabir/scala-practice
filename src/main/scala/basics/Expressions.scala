package basics

object Expressions extends App {

  val x = 1 +  2  // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>>>(right shift with zero extension
  println(1 == x)
  // == != > >= < <=

  println(!(1==x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also work with -= *= /= (This only works with vars, these are all side effect)
  println(aVariable)

  // Instructions(DO) vs Expressions(VALUE)
  // An Instructions are something that we tell the computer to do, for example, change a variable, print to the console
  // An Expression is something that has a value or and, or a type, in functional programming in general we'll think in terms of expressions, that is every single bit of code of your code will compute a value

  // IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 6 else 3  // Here the if expression gives back a value, that's why it's called an if expression, not an if instruction
  println(aConditionValue)
  // we can also do this
  println(if(aCondition) true else false)

  var i=0
  while(i < 10){
    println(i)
     i += 1
  }

  // NEVER WRITE THIS AGAIN.

  // EVERYTHING IN SCALA IS AN EXPRESSION!!

  val aWeiredValue = (aVariable = 3)  // Unit === void
  println(aWeiredValue) // () -> It is value of unit

  // example of side effects: println(), whiles, reassigning


  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "hello" else "goodbye"

  }

  // If in Scala is an expression
  // Code blocks in Scala are expressions
    // the value of the block is the value of its last expression

  //  1. difference between "hello world" vs println("hello world")
  //  "hello world" -> is a value of type string, a string literal[It is a unit]
  //  println("Hello World") -> it is an expression which is a side effect( side effects, they are the expressions returning unit)[It is a Unit]
  // 2.

  val someValue = {
    2 <3
  }

  // someValue is a type of value boolean, and here the value of someValue is true
  val someOthervalue = {
    if(someValue) 239 else 986
    42
  }

  println(someOthervalue) // 42
}
