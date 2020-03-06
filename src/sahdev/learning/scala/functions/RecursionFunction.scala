package sahdev.learning.scala.functions

object RecursionFunction {
  
  def main(args:Array[String]){
    val num = 20
    
    println("Factorail called, normal recursion will occurse Output: "+factorialRecursion(num))
    println("Factorail called, tail recursion will occurse Output: "+factorialTailRecursion(num,1))
    
  }
  
  def factorialRecursion(a:Long):Long={
    
    if (a==1){
      return 1
    }
    else{
      return a*factorialRecursion(a-1)
    }
  }
  
  
  def factorialTailRecursion(a:Long,result:Long):Long={ 
    if (a==1){
      return result
    }else{
      return factorialTailRecursion(a-1,a*result)
    }
  }
  
}