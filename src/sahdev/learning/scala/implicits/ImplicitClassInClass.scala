package sahdev.learning.scala.implicits

class ImplicitClassInClass {
  implicit class ImplicitNestedClass(name: String){
    val myName = name
    def reverseInputArgument()={
      name.reverse
    }
  }
}