package sahdev.learning.scala.functions

object NamedArgumentFunction {
  def main(args: Array[String]):Unit = {
    
    val age = 25
    val name = "Sahdev Rana"
    
    calledFunction(a=age, b=name)
    
    /**Here we are calling method by giving methods argument's name. This is known as function call by named argument.
     * If we are using named argument then there is no need to worry about order or method's/function's parameters but name should be correct.
     * We can call same function with different order also for example below call. 
     */
    
    calledFunction(b=name, a=age)
    
  }
  
  def calledFunction(a:Int,b:String){
    println("Value of a = "+a+"\nValue of b = "+b)
    println()
  }
}