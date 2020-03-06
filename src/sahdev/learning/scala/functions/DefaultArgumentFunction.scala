package sahdev.learning.scala.functions

object DefaultArgumentFunction {
  
  def main(args: Array[String]): Unit = {
    calledFunction1("Mr", "X", 45)
    calledFunction1(age=25)
    //calledFunction1(25) //Will give an error as compiler will consider it as first parameter & for last parameter there is no default value.
    
    calledFunction2(45,"Mr", "X")
    calledFunction2(25) //This will execute. So try to make default parameters as last arguments of function.method.
  }
  
  def calledFunction1(fName:String="Sahdev",lName:String="Rana",age:Int){
    println("Passed details for method 1 are:")
    println("Name: "+fName+" "+lName)
    println("Age: "+age)
    
  }
  
    def calledFunction2(age:Int,fName:String="Sahdev",lName:String="Rana"){
    println("Passed details for mothod 2 are:")
    println("Name: "+fName+" "+lName)
    println("Age: "+age)
    
  }
}