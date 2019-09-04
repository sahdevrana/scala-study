package sahdev.learning.scala.extractor

 class ApplyMethodExample {

 // def myFun:String="strinhg"
  
  def apply(email:String,domain:String):String=
  {
   // return email+"@"+domain
    return s"${email}@${domain}"
  }
  
  //ApplyMethodExample("Sahdev","gmail.com") // If I will create apply method in object then I can access that by using object name with ().
  
  def unapply(emailId:String):Option[(String,String)]=
  {
    val email =emailId.split("@")
     
    if(email.length==2)
    {
     return Some(email(0),email(1))
    }
    else 
    {
      None
    }
    
  }
  
}

object ApplyMethodExample
{
  
  def main(args: Array[String]): Unit = {
    
    val ex=new ApplyMethodExample() //Created an object of comapnion class.
    
//    ex.apply("gg", "kk") //I can call apply method like this also and it will execute. 
//    ex.myFun
  
    
    val emailadd=ex("Sahdev","gmail.com") //Apply method called automatically once you put brackets and argument(can be zero or more) in an object ex.apply("Sahdev","@gmail.com")
    
    println(ex.unapply(emailadd).get._1) // I can call unapply method like this also.
    
    emailadd match {
      case ex(splitedEmailID) => println(s"${splitedEmailID._1} is having an accoung on ${splitedEmailID._2} domain.")
      case _ => println("This is my default case.")
    }
    
    }
    
  }

