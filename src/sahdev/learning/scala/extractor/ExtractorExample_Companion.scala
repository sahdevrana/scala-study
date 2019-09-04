package sahdev.learning.scala.extractor

 class ApplyMethodExample {
  
  def apply(email:String,domain:String):String=
  {
   // return email+"@"+domain
    return s"${email}@+${domain}"
  }
  
 // def myFun:String="strinhg"
  
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
    
    val ex=new ApplyMethodExample()
    
//    ex.apply("gg", "kk")
//    ex.myFun
   
    
    val emailadd=ex("Sahdev","gmail.com")//Apply method called automatically once you put brackets and argument(can be zero or more) in an object ex.apply("Dibyajita","@gmail.com")
    
    println(ex.unapply(emailadd).get._1)
    }
    
  }

