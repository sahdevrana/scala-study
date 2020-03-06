package sahdev.learning.scala.functions

import java.util.Date

object HigherOrderFuncEx {

	def main(args: Array[String]): Unit = {
			println("Calling Higer order function 1. It does not return anything")
			
			calledFunction1(passedFunction1, passedFunction2, passedFunction3, passedFunction4)
			
			println()
			println()
			println("Calling Higer order function 2. It returns another function like: (Int)=>Int")
			val a = calledFunction2()
			println("Executing returned funtion and return value from that is: "+a(12))
			

	}


	//This function take another function as a parameter. This is Higher order function.
	def calledFunction1(a: => Unit,b: => Int,c:Int => Unit,d:Int=>Int) {

	  println("Called function a:")
	  a
	  println("Called function b and its return value is: "+b)
	  println("Called function c with parameter 50.")
	  c(50)
	  println("Called function d with parameter 50 and its retunr value is: "+d(50))
	}


	//This function return another function as a parameter. This is Higher order function.
	def calledFunction2():Int=>Int= {
			return (as:Int)=>as*as
	}

	def passedFunction1(){
		println(new Date)
	}

	def passedFunction2():Int={
			new Date().getSeconds
	}


	def passedFunction3(a:Int){
		println(s"Argument $a passed but does not return anything.")
	}

	def passedFunction4(a:Int):Int={
			return a*a
	}



}