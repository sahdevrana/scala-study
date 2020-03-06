package sahdev.learning.scala.functions

import java.util.Date

object CallByNameFunction {
  def main(args: Array[String]): Unit = {
    calledFunction(passedFunction1, passedFunction2)
    /**
     * Here I am calling calledFunction by passing another two functions name. 
     * Now whenever I will use these passed function in my called function at that time its block code will execute.
     * This is know as call by name as I am passing another function code as parameter.
     * 
     * For example printed time difference on calling parameter a in called function.
     */
    
  }
  
  def calledFunction(a: => Unit,b: => Int) {
    a
    Thread.sleep(5000)
    a
    println(b)
  }
  
  def passedFunction1(){
		println(new Date)
	}

	def passedFunction2():Int={
			new Date().getSeconds
	}
}