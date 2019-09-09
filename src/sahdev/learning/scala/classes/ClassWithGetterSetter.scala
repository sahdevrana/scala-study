package sahdev.learning.scala.classes


object GetterSetterClassEx{
  def main(args: Array[String]): Unit = {
    val getterSetterClassObj = new ClassWithGetterSetter
    
    println("Value if orivate variable x: "+getterSetterClassObj.x)
    getterSetterClassObj.x_=(25, "Sahdev Rana") //Here _= use to set then value in private variable x. It is a setter method for _x.
    println("Value if orivate variable x: "+getterSetterClassObj.x)
    
    println("Value of private variable y: "+ getterSetterClassObj.y)
    getterSetterClassObj.y_=("Sahdev Kumar Rana", "Sahdev Rana") //As above here also _= use to set then value in private variable _x. It is a setter method for _x.
    println("Value of private variable y: "+ getterSetterClassObj.y)
  }
}



class ClassWithGetterSetter {
  private var _x = 5 // In Scala we use _ before a private variable name. It is a standard practice.
  private var _y = "Sahdev" 
  private val _user = "Sahdev Rana"
  
  def x = _x // This is a getter method and returning value of private variable _x. 
  def x_= (newValue:Int, userValue: String): Unit ={ // This is setter method and use to set value of private variable _x.
    if (userValue == _user){
      _x = newValue
      println("Value of X changed sucessfully.")
    }
    else{
      println("You are not an authenticated user.")
    }
  }
  
  def y = _y // This is a getter method and returning value of private variable _y. 
  
  def y_= (newUser: String, userValue:String): Unit = { // Same as above it is also setter method and use to set value of private variable _y.
    if (userValue == _user){
      _y = newUser
      println("Value of Y changed sucessfully.")
    }
    else {
      println("You are not an authenticated user.")
    }
  }
  
}