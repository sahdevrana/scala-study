package sahdev.learning.scala.functions

object AnonymousFunction {
	def main(args:Array[String]):Unit  = {

			val a = 25
					val b = 35

					val fName = "Sahdev"
					val lName = "Rana"
					
					/**
					 * Anonymous function are those function which does not have any name and def keyword.
					 * Below are few examples of anonymous function. 
					 * We are assigning these function to some variables so that we can use these functions whenever we want.As these functions does not have any name.
					 * ()=>{} this is the signature and body of anonymous function. It can have n number of parameters or can be without parameters.
					 */

					val fullName = (first:String, last:String)=>{
						first+last
					}:String 
					//In above :String is written type. In anonymous function we give return type after body if we want to give else it is not mandate.
					
					
					val sumValues = (a:Int, b:Int)=> a+b //If single expression or statement is there then no need of body brackets. 
					
					
					val myWarning = () => {
					  println("Only reading will not help, you will have to practice also.")
					}
					
					
					println(fullName(fName,lName))
					println(myWarning)
					println("Sum of values: "+sumValues(a,b))
					

	}
}