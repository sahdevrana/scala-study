package sahdev.learning.scala.implicits

class ImplicitParameter {
 implicit val myName = "Sahdev Rana" //Create an implicit variable using implicit keyword.
 
 def main(args: Array[String]): Unit = {
   val returnedImplicitValue = implicitVariableUsedMethod(25)
   val returnedPassedValue = implicitVariableUsedMethod(28)("Battery")
   
   println("Returned vales are : "+returnedImplicitValue(0)+", "+returnedImplicitValue(1))
   println("Returned vales are : "+returnedPassedValue(0)+", "+returnedPassedValue(1))
   
   
 }
 
 def implicitVariableUsedMethod(age: Int)(implicit name:String): List[String]={ //I used currying function to differentiate between arguments.
   if (name == "Sahdev Rana"){
     println("I passed only one argument so it used implicit variable to assign value to implicit argument.")
     return List(name,age.toString)
   }
   else {
     println("Passed two argument so it did not use implicit variable to assign value to implicit argument.")
     return List(name,age.toString)
   }
 }
 
}