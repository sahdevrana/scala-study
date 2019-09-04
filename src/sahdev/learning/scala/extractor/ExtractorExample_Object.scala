package sahdev.learning.scala.extractor

object ExtractorExample {
  
   def main(args: Array[String]) {
      println ("Apply method : " + apply("Zara", "gmail.com"));
      println ("Unapply method : " + unapply("Zara@gmail.com"));
      println ("Unapply method : " + unapply("Zara Ali"));
      
      val obj=ExtractorExample("SupriyaRani", "techmahindra")
      
       obj match {
         case ExtractorExample(name) => println(name+" is the Extraxted name") 
         //Extraction depends on the return type of the unapply method
         //unapply is invoked
         case _ => println("i cannot calculate")
      }
      
//      obj match {
//         case ExtractorExample2((name,domain)) => println(name+" is the name and domain is "+domain) 
      //Extraction depends on the return type of the unapply method
//         //unapply is invoked
//         case _ => println("i cannot calculate")
//      }
//      
//      
//      
//      
//         "Zara@gmail.com" match {
//         case ExtractorExample2((name,domain)) => println(name+" is the name and domain is "+domain) 
       //Extraction depends on the return type of the unapply method
//         //unapply is invoked
//         case _ => println("i cannot calculate")
//      }
   }
   
   
    //The ingesion method (optional)
   def apply(user: String, domain: String):String = {
          return user +"@"+ domain
          
   }

   // The extraction method (mandatory)
//   def unapply(str: String): Option[(String, String)] = {
//      val parts = str.split("@")
//      
//      if (parts.length == 2)
//      {
//         Some(parts(0), parts(1)) 
//      } 
//      else
//      {
//         None
//      }
//   }
   
   
   
   def unapply(str: String): Option[String] = {
      val parts = str.split("@")
      
      if (parts.length == 2)
      {
         Some(parts(0)) 
      } 
      else
      {
         None
      }
   }

}