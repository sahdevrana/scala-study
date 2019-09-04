package sahdev.learning.scala.extractor

object ExtractorExample {

	/**
	 * @author Sahdev.Rana
	 */
	def main(args: Array[String]): Unit = {
			println ("Apply method : " + apply("Sahdev", "gmail.com"));
			println ("Unapply method : " + unapply("Sahdev@gmail.com"));
			println ("Unapply method : " + unapply("Sahdev Rana"));

			val obj=ExtractorExample("Sahdev.Rana", "tavant") // For an object apply method call automatically as it is singleton.

					obj match {
					case ExtractorExample(name) => println(name+" is the Extraxted name")  
					// Whenever we use pattern matching unapply method call and it match with the retunrn type of unapply method. If return type does not match then that patter does not match. 
					//For case class compiler auto generate unapply method and because of that we can do pattern matching with case classes without writing 
					//Extraction depends on the return type of the unapply method
					//unapply is invoked
					case _ => println("i cannot calculate")
			}
	}


	//The ingesion method (optional) This is an optional method. If I will not create it and write any method to create an email id or if I will pass a full email id then also I will get result from unapply method and pattern will match for that.
	def apply(user: String, domain: String):String = {
			return user +"@"+ domain
			//return user 
			// If I will return this at place of above return statement then it wil not have split argument for unapply method so then unapply method will return none insted of Option[String] and that will not satisfy match condition (return of unapply method should be same as return type).
	}
	
	// The extraction method (mandatory)
	def unapply(str: String): Option[String] = { // Here my return type for satisfied condition is same as my unapply method. If condition is not satisfied then my return type is different so it will not match and I will get output of default.
			val parts = str.split("@")

					if (parts.length == 2)
					{
						Some(parts(0)) // This is the return for unapply method.
					} 
					else
					{
						None
					}
	}
	

	// The extraction method (mandatory)
	//   def unapply(str: String): Option[(String, String)] = {
	//      val parts = str.split("@")
	//      if (parts.length == 2)
	//      {
	//         Some(parts(0), parts(1)) 
	//      } 
	//      else
	//      {
	//         None
	//      }
	//   }




}