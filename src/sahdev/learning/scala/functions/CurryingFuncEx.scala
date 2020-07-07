package sahdev.learning.scala.functions

object CurryingFuncEx {
  def main(args: Array[String]): Unit = {
    
    val x=20
    val y=30
    val z = "Sum of values"
    
    
    val addition = calledMethod1(x, y)(z)
    val multiply = callMethod2(x)(y)
    
    println(addition)
    println(multiply)
    
    
  }
  
  //Currying function is when we use separate brackets for parameters. We mostly use it for partial applied function/methods.  
  def calledMethod1(a:Int,b:Int)(c:String):String={
    c+": "+a+b
  }
  
  //We can write currying function like this also.
  def callMethod2(a:Int)=(b:Int)=>{
    a*b
  }:Int
}