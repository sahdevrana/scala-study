package sahdev.learning.scala.implicits

object ImplicitParameter {
 implicit val myName = "Sahdev Rana" //Create an implicit variable using implicit keyword.
 
 def main(args: Array[String]): Unit = {
   val returnedImplicitValue = implicitVariableUsedMethod(25) //Called same method with one parameter only.
   val returnedPassedValue = implicitVariableUsedMethod(28)("Battery") //Called second method with all parameters.
   
   println("Returned vales are : "+returnedImplicitValue(0)+", "+returnedImplicitValue(1)) //Output: Sahdev Rana, 25
   println("Returned vales are : "+returnedPassedValue(0)+", "+returnedPassedValue(1)) // Output: Battery, 28
   
   
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