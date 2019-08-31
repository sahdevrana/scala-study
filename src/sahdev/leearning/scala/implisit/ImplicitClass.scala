package sahdev.leearning.scala.implisit

object ImplicitClassObject {
  implicit class ImplicitCLass(x: String){
    def reverseInput = x.reverse
    def addRandomContent = x + "12324321"
  } //This is an implicit class and can be instanciated by the compiler whenever required which means there is no need to make an object of this class manually to access its values/methods.
}

class UseImcplicitClass(){
  
  
  val anyRandomString = "Sahdev_Rana"
  ImplicitClassObject.ImplicitCLass("Sahdev_Rana")
  reverseInput
  
  
  
}