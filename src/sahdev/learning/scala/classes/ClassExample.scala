package sahdev.learning.scala.classes

object ClassExample {
  def main(args: Array[String]): Unit = {
    val firstClassObject = new FirstClassEx()
    val secondClassObject = new SecondClassEx()
    val thirdClassObject = new ThirdClassEx(1,2)
    val fourthClassEx = new FourthClassEx(10,20)
    val fifthClassEx = new FifthClassEx
    
  }
}


class FirstClassEx // This is a smallest class definition. A class keyword with a identifier is creating a class. I created its object(Carbon Copy) in main method.


class SecondClassEx{ // This is class with default constructor which is not taking any parameter. It is a primary constructor without any parameter.
  
}


class ThirdClassEx(x: Int, y: Int){
  
}


class FourthClassEx(var x:Int, var y: Int){
  
}


class FifthClassEx(var x:Int = 1, var name: String = "Sahdev"){
  
}

