package week2

object higherorder {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def sum(f : Int => Int, a : Int, b : Int) : Int =
  	if (a > b) 0
  	else f(a) + sum(f, a+1, b)                //> sum: (f: Int => Int, a: Int, b: Int)Int
  
  def sum2(f : Int => Int)(a : Int, b : Int) : Int = {
  	def loop(a : Int, acc : Int) : Int = {
  	
	  	if ( a > b ) acc
	  	else loop(a+1, f(a) + acc)
  	}
  	
  	loop(a, 0)
  }                                               //> sum2: (f: Int => Int)(a: Int, b: Int)Int
  
  sum2(x=>x * x)(1,5)                             //> res0: Int = 55
  
  
   def sum3(f: Int => Int) : (Int, Int) => Int = {
   	def sumF(a: Int, b : Int) : Int =
  		if (a>b) 0
  		else f(a) + sumF(a + 1, b)
  	
  	sumF
  }                                               //> sum3: (f: Int => Int)(Int, Int) => Int
  
  def sum4(f: Int => Int)(a : Int, b : Int) : Int = {
   	if (a > b) 0 else f(a) + sum4(f)(a+1, b)
  	
  }                                               //> sum4: (f: Int => Int)(a: Int, b: Int)Int
  	
  
  
  def id(x : Int) : Int = x                       //> id: (x: Int)Int
  
  def sumInts(a : Int, b : Int) : Int =
  	if (a > b) 0 else a + sumInts(a + 1, b)   //> sumInts: (a: Int, b: Int)Int
  
  def sumInts2(a : Int, b : Int) : Int = sum(id, a, b)
                                                  //> sumInts2: (a: Int, b: Int)Int
  // ananymous
  def sumInts3(a : Int, b : Int) : Int = sum(x => x, a, b)
                                                  //> sumInts3: (a: Int, b: Int)Int
  
  def sumInts4 = sum3(x=>x)                       //> sumInts4: => (Int, Int) => Int
  
  sumInts(1, 10)                                  //> res1: Int = 55
  sumInts2(1, 10)                                 //> res2: Int = 55
  sumInts3(1, 10)                                 //> res3: Int = 55
  sum2(x=>x)(1,10)                                //> res4: Int = 55
  sumInts4(1,10)                                  //> res5: Int = 55
  sum3(id)(1,10)                                  //> res6: Int = 55
  sum4(id)(1,10)                                  //> res7: Int = 55
  
  def cube (x : Int) : Int = x * x * x            //> cube: (x: Int)Int
  
  def sumCubes(a : Int, b : Int) : Int =
  	if (a > b) 0 else cube(a) + sumCubes(a + 1, b)
                                                  //> sumCubes: (a: Int, b: Int)Int
  def sumCubes2(a : Int, b : Int) : Int = sum(cube, a, b)
                                                  //> sumCubes2: (a: Int, b: Int)Int
  // ananymous
  def sumCubes3(a : Int, b : Int) : Int = sum(x => x * x * x, a, b)
                                                  //> sumCubes3: (a: Int, b: Int)Int
  
  def sumCubes4 = sum3(x=>x*x*x)                  //> sumCubes4: => (Int, Int) => Int
  
  sumCubes(1, 5)                                  //> res8: Int = 225
  sumCubes2(1, 5)                                 //> res9: Int = 225
  sumCubes3(1, 5)                                 //> res10: Int = 225
  sum2(x => x*x*x)(1, 5)                          //> res11: Int = 225
  sumCubes4(1,5)                                  //> res12: Int = 225
  sum3(cube)(1,5)                                 //> res13: Int = 225
  sum4(cube)(1,5)                                 //> res14: Int = 225
  	
  def fact(n: Int) : Int = {
  	def loop(acc: Int, n: Int): Int =
  		if (n ==0) acc
  		else loop(acc * n, n-1)
  		
  	loop(1, n);
  
  }                                               //> fact: (n: Int)Int
  
  fact(5)                                         //> res15: Int = 120
  
  def sumFactorials(a : Int, b : Int) : Int =
  	if (a > b) 0 else fact(a) + sumFactorials(a + 1, b)
                                                  //> sumFactorials: (a: Int, b: Int)Int
	def sumFactorials2(a : Int, b : Int) : Int = sum(fact, a, b)
                                                  //> sumFactorials2: (a: Int, b: Int)Int
  def sumFactorials4 = sum3(fact)                 //> sumFactorials4: => (Int, Int) => Int
  
  sumFactorials(1, 5)                             //> res16: Int = 153
  sumFactorials2(1, 5)                            //> res17: Int = 153
  
  
  sum2(fact)(1,5)                                 //> res18: Int = 153
  sumFactorials4(1,5)                             //> res19: Int = 153
  sum3(fact)(1,5)                                 //> res20: Int = 153
  sum4(fact)(1,5)                                 //> res21: Int = 153
  
  
}