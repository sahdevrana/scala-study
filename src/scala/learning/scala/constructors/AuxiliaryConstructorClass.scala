package scala.learning.scala.constructors

import java.util.Date

object AuxiliaryConstructorRun {
  def main(args: Array[String]){
    val classObjectByPrimaryConstructor = new AuxiliaryConstructorClass("It is executed by primary Constructor directly") //I am creating this object by using primary constructor. Body of primary constructor is same as class body. It is same as java default constructor.
    val classObjectByAuxiliaryConstructor = new AuxiliaryConstructorClass("Sahdev", 25) //Here I am creating this object using auxiliary constructor which is having 2 parameters as input. This auxiliary constructor will first call primary constructor and after primary construction execution it's execution will start.
    val classObjectByAuxiliaryConstructor2 = new AuxiliaryConstructorClass("Sahdev", 25,"Rana") // This object is also created by auxiliary constructor of 3 parameters. This auxiliary constructor will also first call primary constructor and after primary construction execution it's execution will start.
  }
}

class AuxiliaryConstructorClass(callerConstructor: String){ // This is primary constructor and its body is also same as class body. Whatever is in class body it will execute that.
  println("Primary Constructor execution started after calling from constructor with: "+ callerConstructor)
  val date = new Date()
  var name:String = null
  var age:Int = 25
  
  def this(name: String, age: Int){ // This is auxiliary constructor as we can also use this to create an object of this class. 
    this("two parameters") //In each constructor it is mandatory to call primary constructor else it will throw an exception.
    println("Auxiliary construct with two parameters execution started.")
    this.name = name //This keyword also use to refer to class members like here it is using to refer class variable name.
    this.age = age
    
    println("Auxiliary construct with two parameters execution ended.")
  }
  
  def this(name: String, age: Int, callerName: String){ // This is also auxiliary constructor, this is called constructor overloading as I am defining multiple parameters constructor for same class.
    this("tree parameters")
    println("Auxiliary construct with three parameters execution started. Execution called by : "+ callerName)
    
    this.name = name
    this.age = age
    
    println("Auxiliary construct with three parameters execution ended.")
  }
  
  println("Primary Constructor execution ended after")
  
}