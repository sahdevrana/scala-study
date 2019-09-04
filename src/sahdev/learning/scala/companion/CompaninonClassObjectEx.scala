package sahdev.learning.scala.companion

 
class CompaninonClassObjectEx {
	private val name = "Sahdev Rana"
			private val age = 25
			val address = "Somewhere in Bangalore"
			private def privateMethod(): String = {
					return age + ", " + name
			}

			def notPrivateMethod(): String = {
					return name + ", " +age 
			}
			
			
			println(CompaninonClassObjectEx.objectVariable+" called through comapnion class.")
}



object CompaninonClassObjectEx {
  private val objectVariable = "Private variable of companion object."

	def main(args: Array[String]):Unit = {
			val companionClassObject = new CompaninonClassObjectEx()
			println(companionClassObject.age+", "+ companionClassObject.name)
			println("Class private method return value of: "+companionClassObject.privateMethod())
			println("Class non private method return value: "+companionClassObject.notPrivateMethod())
			
			
			AnotherObject.otherObjectMethod()
	}

}


object AnotherObject{
  def otherObjectMethod(){
   val companionClassObject = new CompaninonClassObjectEx 
  println("Class non private variable value: "+companionClassObject.address)
  println("Class non private method return value: "+companionClassObject.notPrivateMethod()) 
  }
  
}