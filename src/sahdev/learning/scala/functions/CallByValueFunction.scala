package sahdev.learning.scala.functions

object CallByValueFunction {
  def main(args:Array[String]):Unit ={
   val a = 10
   val b = 20
   
   
   //In below expressions we are calling a methods and storing its outputs in a variables.
   
   val sumValue = calledFunction(a, b);
   val sumValue2 = calledFunction2(a, b);
   calledFunction3(a, b)
   
   /**
    * When we call a method and it calculate values of passed parameters first and then with those values it call the function.
    * That call is known as function call by value.
    */
   
   println(sumValue)
   println(sumValue2)
   
    
  }
  
  def calledFunction(a: Int, b: Int): Int = {
    
    a+b 
    /*Here above expression's value is consider as return value because it is last expression of function/method. 
    In Scala there is no need to write return keyword if we want to return last expression output and method output.*/
    
    //return a+b //If I will write this also then it will work fine.
    
  }
  
  
  //If any function has one statement only then there is no need to use block brackets, we can write that like below also:
  def calledFunction2(a:Int,b:Int): Int = a+b
  
  //If any method/function does not return any value then we can write that without using = . Below is an example: 
  def calledFunction3(a:Int, b:Int){
    println(a+b)
  }
  
}