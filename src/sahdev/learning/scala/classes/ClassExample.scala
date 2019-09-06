package sahdev.learning.scala.classes

object ClassExample {
  def main(args: Array[String]): Unit = {
    val firstClassObject = new FirstClassEx // Here I am creating an object of my class. As there is no parameter in primary constructor so I can create object without () also.
    
    val secondClassObject = new SecondClassEx // This is also same  as above. Its constructor body is same as class body.
    
    val thirdClassObject = new ThirdClassEx(1,2) // In this class I am passing two parameters as its primary constructor has two parameters.
    
    val fourthClassEx = new FourthClassEx(10,20) // Same as above. Parameters of this class's constructor are defined as var/val so these are public in nature and are acessable outside of class with class object. 
    
    val fifthClassEx = new FifthClassEx() // This class's constructor is having default parameters so either I can pass parameter during object creation or if I will not pass then it will consider default values. 
    
    val fifthClassExWithPara = new FifthClassEx(25,"Rana") // Same as above but passed values as per requirement.
  }
}


class FirstClassEx // This is a smallest class definition. A class keyword with a identifier is creating a class. I created its object(Carbon Copy) in main method.


class SecondClassEx{ // This is class with default constructor which is not taking any parameter. It is a primary constructor without any parameter.
  
}


class ThirdClassEx(x: Int, y: Int){
  
}


class FourthClassEx(var x:Int, val y: Int){
  
}


class FifthClassEx(var x:Int = 1, var name: String = "Sahdev"){
  
}

