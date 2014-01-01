package week5

object week5 {
  val fruit = List("apples", "oranges", "pears")  //> fruit  : List[String] = List(apples, oranges, pears)
  val nums = List(1,2,3)                          //> nums  : List[Int] = List(1, 2, 3)
  val diag3 = List(List(1,0,0), List(0,1,0), List(0,0,1))
                                                  //> diag3  : List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
                                                  //| 
	val vet = Vector("1","2")                 //> vet  : scala.collection.immutable.Vector[String] = Vector(1, 2)
	vet(8)                                    //> java.lang.IndexOutOfBoundsException: 8
                                                  //| 	at scala.collection.immutable.Vector.checkRangeConvert(Vector.scala:137)
                                                  //| 
                                                  //| 	at scala.collection.immutable.Vector.apply(Vector.scala:127)
                                                  //| 	at week5.week5$$anonfun$main$1.apply$mcV$sp(week5.week5.scala:8)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week5.week5$.main(week5.week5.scala:3)
                                                  //| 	at week5.week5.main(week5.week5.scala)
	
  val empty = List()
  
 	def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n+1)
	removeAt(1, nums)
	nums.drop(2)
	
	val pair = ("answer", 42)
	val (label, value) = pair
}