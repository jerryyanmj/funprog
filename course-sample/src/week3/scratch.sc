package week3

import week3.{Rational, Hello}

object scratch {
  new Rational(1,2)                               //> res0: week3.Rational = 1/2
  Hello.main(null)                                //>  Hello World
  
  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing
  
  error("test")                                   //> java.lang.Error: test
                                                  //| 	at week3.scratch$$anonfun$main$1.error$1(week3.scratch.scala:9)
                                                  //| 	at week3.scratch$$anonfun$main$1.apply$mcV$sp(week3.scratch.scala:11)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week3.scratch$.main(week3.scratch.scala:5)
                                                  //| 	at week3.scratch.main(week3.scratch.scala)
  val x = null
  val y:String = x
  
  if (true) 1 else false
}