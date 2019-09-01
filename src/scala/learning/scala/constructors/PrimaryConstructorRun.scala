package scala.learning.scala.constructors

object PrimaryConstructorRun {
	def main(args: Array[String]): Unit = {
			
	  val primaryConstructorClassObject = new PrimaryConstructorClass("Sahdev",25) //When we create an object of any class, its constructor completes full execution.
					println(primaryConstructorClassObject.returnConstructorArguments())
					
					
					/**
					 * Output of above commands will be: 
					 * Line 1: Primary constructor execution started.
					 * Line 2: Primary constructor execution ended.
					 * Line 3: Sahdev, 25
					 * 
					 * 
					 * Note: In above two lines as constructor completed its execution so all variable's value assignment and print statements of that constructor will execute first. So in above outputs we got print statements of constructor first.
					 */
	}
}


class PrimaryConstructorClass(name: String,age: Int){ //Parameter list after class name during class definition is primary constructor. Its body is same as class body and whatever is in that body it will execute that during object creation.

	println("Primary constructor execution started.")
	val receivedName = name
	val receivedAge = age


	def returnConstructorArguments(): String = {
			return receivedName + ", " + receivedAge 
	}

	println("Primary constructor execution ended.")
}