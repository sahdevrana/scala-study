package sahdev.learning.scala.implicits

import scala.util.Random

object ImplicitConversion_Or_Function {
  
  def main(args: Array[String]): Unit = {
    println(stringValueGenerator +" is the a number generated by random and called as string value.")
  }
    
  implicit def intToString (intValiable: Int): Int = intValiable 
  //It is an implicit conversion/Function which convert int into String.
  
  //implicit def intToString (intValiable: Int): String = intValiable.toString  //==========One more Implicit Function========= 
  //If I will uncomment above function then both implicit function will have same parameter list and same return type so compiler will not able to choose which one to call whenever required. 
  //So it will give an compilation error as no implicit function will use to convert int into string.  
  
  implicit def intToStringAfterSum (intValiable: Int): String = {
    val increasedIntValue = intValiable + 1
    increasedIntValue.toString()
  }
  
  def randomIntegerGenerator : Int = Random.nextInt //This will create a number number.
  
  def stringValueGenerator:String = randomIntegerGenerator 
  //This will give an error if implicit function is not here. If there is any implicit function for this type conversion then it will call automatically.
  //The above expression will automatically changed like intToString(randomIntegerGenerator) by compiler. As implicit functions called automatically.
  
}