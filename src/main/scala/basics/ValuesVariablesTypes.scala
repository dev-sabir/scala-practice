package basics

object ValuesVariablesTypes extends App{

  // Variable declare with val can't be reassign
  val x: Int =  42
  println(x)

  // x =2 Can't possible
  // VALS ARe IMMUTABLE

  // Here we are telling the data type
  val z = 20
  // COMPILER CAN INFER TYPES

  val aString: String = "Hello"
  val anotherString = "Welcome to Scala"

  val aBoolean: Boolean = false
  val aChar: Char = 'A'
  val anInt: Int = x // 4 bytes
  val aShort: Short = 4613  // 2 bytes
  val aLong : Long =  323445513233435L  // 8 bytes
  val aFloat: Float = 1.0f
  val aDouble: Double = 3.14

  // variables

  var aVariables: Int = 4
  aVariables = 5   //side effects

  // 1. prefer vals over vars
  // 2. all vals and vars have types
  // 3. compiler automatically infers types when omitted




}
