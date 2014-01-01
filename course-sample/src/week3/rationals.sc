package week3

object rationals {
  val x =new Rational(1,3)                        //> x  : week3.Rational = 1/3
  val y = new Rational(5,7)                       //> y  : week3.Rational = 5/7
  val z = new Rational(3,2)                       //> z  : week3.Rational = 3/2
  x.denom                                         //> res0: Int = 3
  x.numer                                         //> res1: Int = 1
  x.add(y)                                        //> res2: week3.Rational = 22/21
  x add y                                         //> res3: week3.Rational = 22/21
  x.sub(y)                                        //> res4: week3.Rational = 8/-21
  x sub y                                         //> res5: week3.Rational = 8/-21
  x.neg                                           //> res6: week3.Rational = 1/-3
  z.neg                                           //> res7: week3.Rational = 3/-2
  
  x.sub(y).sub(z)                                 //> res8: week3.Rational = -79/42
  x sub y sub z                                   //> res9: week3.Rational = -79/42
  
  y.add(y)                                        //> res10: week3.Rational = 10/7
  x.less(y)                                       //> res11: Boolean = true
  x less y                                        //> res12: Boolean = true
  x.max(y)                                        //> res13: week3.Rational = 5/7
  x max y                                         //> res14: week3.Rational = 5/7
  
  //val strange = new Rational(1,0)
  //strange.add(strange)
  
  new Rational(23)                                //> res15: week3.Rational = 23/1
  
  
  
  val a =new Rational4(1,3)                       //> a  : week3.Rational4 = 1/3
  val b = new Rational4(5,7)                      //> b  : week3.Rational4 = 5/7
  val c = new Rational4(3,2)                      //> c  : week3.Rational4 = 3/2
  a.denom                                         //> res16: Int = 3
  a.numer                                         //> res17: Int = 1
  a + b                                           //> res18: week3.Rational4 = 22/21
  a + b                                           //> res19: week3.Rational4 = 22/21
  -a                                              //> res20: week3.Rational4 = 1/-3
  -c                                              //> res21: week3.Rational4 = 3/-2
  
  a -b - c                                        //> res22: week3.Rational4 = -79/42
  b + b                                           //> res23: week3.Rational4 = 10/7
  a < b                                           //> res24: Boolean = true
  a.max(b)                                        //> res25: week3.Rational4 = 5/7
  
  //val strange = new Rational(1,0)
  //strange.add(strange)
  
  new Rational4(23)                               //> res26: week3.Rational4 = 23/1
  
  
}

class Rational(x : Int, y : Int) {
	require(y != 0, "denominator must be nonzero")
	
	def this(x:Int) = this(x,1)
	
	private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b, a%b)
	private val g = gcd(x,y)
	def numer = x/g
	def denom = y/g
	
	def add(that : Rational) =
		new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
	
	def neg : Rational = new Rational(-numer, denom)
	
	def sub(that : Rational) = add(that.neg)
	
	def less(that : Rational) = this.numer * that.denom < that.numer * this.denom
	
	def max(that : Rational) = if (this.less(that)) that else this
	
	override def toString = numer + "/" + denom
		
}

class Rational2(x : Int, y : Int) {
// This can be advatageous if it is expected that the function numer and denom are called often.
	private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b, a%b)
	val numer = x/gcd(x,y)  // only once
	val denom = y/gcd(x,y)  // only once
	
	def add(that : Rational) =
		new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
	
	def neg : Rational = new Rational(-numer, denom)
	
	def sub(that : Rational) = add(that.neg)
	
	override def toString = numer + "/" + denom
		
}

class Rational3(x : Int, y : Int) {
// This can be advatageous if it is expected that the function numer and denom are called infrequently.
	private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b, a%b)
	def numer = x/gcd(x,y)
	def denom = y/gcd(x,y)
	
	def add(that : Rational) =
		new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
	
	def neg : Rational = new Rational(-numer, denom)
	
	def sub(that : Rational) = add(that.neg)
	
	override def toString = numer + "/" + denom
		
}

class Rational4(x : Int, y : Int) {
	require(y != 0, "denominator must be nonzero")
	
	def this(x:Int) = this(x,1)
	
	private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b, a%b)
	private val g = gcd(x,y)
	def numer = x
	def denom = y
	
	def + (that : Rational4) =
		new Rational4(numer * that.denom + that.numer * denom, denom * that.denom)
	
	def unary_- : Rational4 = new Rational4(-numer, denom)
	
	def - (that : Rational4) = this + -that
	
	def < (that : Rational4) = this.numer * that.denom < that.numer * this.denom
	
	def max(that : Rational4) = if (this < that) that else this
	
	override def toString = {
		val g = gcd(x,y)
		numer/g + "/" + denom/g
	}
		
}