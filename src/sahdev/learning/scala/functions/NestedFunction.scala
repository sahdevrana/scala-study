package sahdev.learning.scala.functions

object NestedFunction {
  def main(args: Array[String]): Unit = {
    val a = 50
    
    //This function is inside main method/function. It is called Nested method/function or local method of main method.
    def squareOf(x:Int){
      println(x*x)
    }
    
    squareOf(a)
    
  }
}