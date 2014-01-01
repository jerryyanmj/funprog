package week7

object streamrange {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def streamRange(lo: Int, hi: Int): Stream[Int] = {
  	print(lo + " ")
  	if (lo >= hi) Stream.empty
  	else Stream.cons(lo, streamRange(lo+1, hi))
  
  }                                               //> streamRange: (lo: Int, hi: Int)Stream[Int]
  
  streamRange(1,10).take(3)                       //> 1 res0: scala.collection.immutable.Stream[Int] = Stream(1, ?)
  
  lazy val x = 1                                  //> x: => Int
  x                                               //> res1: Int = 1
  val y = x                                       //> y  : Int = 1
  x                                               //> res2: Int = 1
  
  
  def expr = {
  	val x = {print("x"); 1}
  	lazy val y = {print("y"); 2}
  	def z = {print("z"); 3}
  	
  	x + y + x + z + y + x
  }                                               //> expr: => Int
  
  expr                                            //> xyzres3: Int = 10
  
}