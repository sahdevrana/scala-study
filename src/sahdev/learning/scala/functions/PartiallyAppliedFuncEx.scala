package sahdev.learning.scala.functions

import java.util.Date


object PartiallyAppliedFuncEx {
	def main(args: Array[String]): Unit = {


			val partialApplied = calledFunction("Second during called time")(_)
			//In aove expression we applied function partially by passing message and instead of second parameter we passed _
			//Now we can use different different values for second parameter like below.
			
					partialApplied(new Date().getSeconds)

					Thread.sleep(1000)
					partialApplied(new Date().getSeconds)

					Thread.sleep(1000)
					partialApplied(new Date().getSeconds)

					Thread.sleep(1000)
					partialApplied(new Date().getSeconds)

					Thread.sleep(1000)
					partialApplied(20)


	}

	def calledFunction(message:String)(sr:Int){
		println(message+" "+sr)
	}
}