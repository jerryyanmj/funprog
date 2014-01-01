package week2

object currying {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def product(f:Int => Int)(a : Int, b : Int) : Int =
  	if (a > b) 1
  	else f(a) * product(f)(a+1,b)             //> product: (f: Int => Int)(a: Int, b: Int)Int
  
  product(x=>x*x)(1,5)                            //> res0: Int = 14400
  
  
  def fact(a : Int) : Int = product(x=>x)(1,a)    //> fact: (a: Int)Int
  
  fact(5)                                         //> res1: Int = 120
  
  def mapReduce(f: Int => Int, combile: (Int, Int) => Int, zero : Int)(a : Int, b : Int) : Int =
  	if (a > b) zero
  	else combile(f(a), mapReduce(f, combile, zero)(a+1, b))
                                                  //> mapReduce: (f: Int => Int, combile: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
  	
  def product2(f:Int => Int)(a : Int, b : Int) : Int = mapReduce(f, (x,y) => x*y, 1)(a, b)
                                                  //> product2: (f: Int => Int)(a: Int, b: Int)Int
  
  product2(x=>x*x)(1,5)                           //> res2: Int = 14400
  
}