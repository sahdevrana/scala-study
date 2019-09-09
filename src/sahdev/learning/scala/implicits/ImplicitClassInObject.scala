package sahdev.learning.scala.implicits
import sahdev.learning.scala.implicits.ImplicitClassObject.ImplicitClass


object ImplicitExampleCallMain{
	def main (args: Array[String]): Unit = {

			//Code to execute implicit class of external Scala file, Example - 1
			val useExternalFilesImplicitClass = new ImplicitClassInClass()
					import useExternalFilesImplicitClass.ImplicitNestedClass
					println("Sahdev Rana".reverseInputArgument)
					println(s"Above value is reversed output of implicit class method reverse of given input : "+ "Sahdev".myName)


					//Code to execute implicit class use by Example - 2
					val useImplicitClassReturnedValues = new UseImcplicitClass().useImplicitClassMethods()
					useImplicitClassReturnedValues foreach println

	}
}


//Example for implicit class - 2

object ImplicitClassObject {
	implicit class ImplicitClass(x: String){
		def reverseInput = x.reverse
				def addRandomContent = x + "12324321"
	} //This is an implicit class and can be instanciated by the compiler whenever required which means there is no need to make an object of this class manually to access its values/methods.
}

class UseImcplicitClass(){

	val anyRandomString = "Sahdev_Rana"

			def useImplicitClassMethods():List[String] = {
					val reversedRandomString = anyRandomString.reverseInput
							val addedContentIntoRandomString = anyRandomString.addRandomContent

							/**
							 * In above variable I stored return of Implicit class methods. As it is an Implicit class so there is no need to create an object of this class to access its members like methods and variables.
							 * I just imported that class in scope of my current class and used its methods.
							 */

							List(reversedRandomString, addedContentIntoRandomString)

							/**
							 * Return of above statements is a list and below are the list's arguments:
							 * Arg 1: anaR_vedhaS
							 * Arg 2: Sahdev_Rana12324321
							 */
			}


}