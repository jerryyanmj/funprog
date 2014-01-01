package week6

import com.sun.org.apache.bcel.internal.generic.ISUB

object test {
  val xs = Array(1, 2, 3, 44)                     //> xs  : Array[Int] = Array(1, 2, 3, 44)
  xs map (x => x * 2)                             //> res0: Array[Int] = Array(2, 4, 6, 88)

  val s = "Hello World"                           //> s  : String = Hello World
  s filter (c => c.isUpper)                       //> res1: String = HW
  s exists (c => c.isUpper)                       //> res2: Boolean = true
  s forall (c => c.isUpper)                       //> res3: Boolean = false

  val r: Range = 1 until 5                        //> r  : Range = Range(1, 2, 3, 4)
  val t: Range = 1 to 5                           //> t  : Range = Range(1, 2, 3, 4, 5)
  1 to 10 by 3                                    //> res4: scala.collection.immutable.Range = Range(1, 4, 7, 10)
  1 to 7 by 8                                     //> res5: scala.collection.immutable.Range = Range(1)
  6 to 1 by -2                                    //> res6: scala.collection.immutable.Range = Range(6, 4, 2)

  val zipping = List(1, 2, 3, 4, 5) zip s         //> zipping  : List[(Int, Char)] = List((1,H), (2,e), (3,l), (4,l), (5,o))
  zipping unzip                                   //> res7: (List[Int], List[Char]) = (List(1, 2, 3, 4, 5),List(H, e, l, l, o))

  s flatMap (c => List('.', c))                   //> res8: String = .H.e.l.l.o. .W.o.r.l.d

  xs.sum                                          //> res9: Int = 50
  xs.max                                          //> res10: Int = 44
  xs.min                                          //> res11: Int = 1
  xs.product                                      //> res12: Int = 264

  (1 to 5) flatMap (x => (1 to 20) map (y => (x, y)))
                                                  //> res13: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,
                                                  //| 2), (1,3), (1,4), (1,5), (1,6), (1,7), (1,8), (1,9), (1,10), (1,11), (1,12),
                                                  //|  (1,13), (1,14), (1,15), (1,16), (1,17), (1,18), (1,19), (1,20), (2,1), (2,2
                                                  //| ), (2,3), (2,4), (2,5), (2,6), (2,7), (2,8), (2,9), (2,10), (2,11), (2,12), 
                                                  //| (2,13), (2,14), (2,15), (2,16), (2,17), (2,18), (2,19), (2,20), (3,1), (3,2)
                                                  //| , (3,3), (3,4), (3,5), (3,6), (3,7), (3,8), (3,9), (3,10), (3,11), (3,12), (
                                                  //| 3,13), (3,14), (3,15), (3,16), (3,17), (3,18), (3,19), (3,20), (4,1), (4,2),
                                                  //|  (4,3), (4,4), (4,5), (4,6), (4,7), (4,8), (4,9), (4,10), (4,11), (4,12), (4
                                                  //| ,13), (4,14), (4,15), (4,16), (4,17), (4,18), (4,19), (4,20), (5,1), (5,2), 
                                                  //| (5,3), (5,4), (5,5), (5,6), (5,7), (5,8), (5,9), (5,10), (5,11), (5,12), (5,
                                                  //| 13), (5,14), (5,15), (5,16), (5,17), (5,18), (5,19), (5,20))

  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double = (xs zip ys).map(xy => xy._1 * xy._2).sum
                                                  //> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double

  val v1 = Vector(1d, 2d, 3d, 4d)                 //> v1  : scala.collection.immutable.Vector[Double] = Vector(1.0, 2.0, 3.0, 4.0)
                                                  //| 
  val v2 = Vector(1d, 2d, 3d, 4d)                 //> v2  : scala.collection.immutable.Vector[Double] = Vector(1.0, 2.0, 3.0, 4.0)
                                                  //| 

  scalarProduct(v1, v2)                           //> res14: Double = 30.0

  def scalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double = (xs zip ys).map { case (x, y) => x * y }.sum
                                                  //> scalarProduct2: (xs: Vector[Double], ys: Vector[Double])Double

  scalarProduct2(v1, v2)                          //> res15: Double = 30.0

  def isPrime(n: Int): Boolean = (2 until n) forall (x => n % x != 0)
                                                  //> isPrime: (n: Int)Boolean

  isPrime(7)                                      //> res16: Boolean = true
  isPrime(4)                                      //> res17: Boolean = false

  List(('c', 8), ('d', 1), ('e', 6))              //> res18: List[(Char, Int)] = List((c,8), (d,1), (e,6))
  List(('c', 8), ('d', 1), ('e', 6)).toMap        //> res19: scala.collection.immutable.Map[Char,Int] = Map(c -> 8, d -> 1, e -> 
                                                  //| 6)

  def recover(charOcc: (Char, Int)): String = {
    val (char, count) = charOcc
    (for (i <- (1 to count)) yield char) mkString

  }                                               //> recover: (charOcc: (Char, Int))String

  recover(('c', 10))                              //> res20: String = cccccccccc

  val tt = ((for (pair <- List(('c', 1), ('d', 1), ('e', 1))) yield recover(pair)) mkString).toList
                                                  //> tt  : List[Char] = List(c, d, e)

  def combOne(charOcc:(Char, Int)): List[List[(Char, Int)]] = {
  	val (char, count) = charOcc
  	List((for (i <- 0 to count) yield (char, i)).toList)
  }                                               //> combOne: (charOcc: (Char, Int))List[List[(Char, Int)]]
  
  combOne(('c',5))                                //> res21: List[List[(Char, Int)]] = List(List((c,0), (c,1), (c,2), (c,3), (c,4
                                                  //| ), (c,5)))
  
	val value1 = List(List(('c',0), ('c',0)), List(('c',0), ('c',0)))
                                                  //> value1  : List[List[(Char, Int)]] = List(List((c,0), (c,0)), List((c,0), (c
                                                  //| ,0)))
	val value2 = List(('c', 8), ('d', 1), ('e', 6))
                                                  //> value2  : List[(Char, Int)] = List((c,8), (d,1), (e,6))
	
	value1 :: value2                          //> res22: List[Product] = List(List(List((c,0), (c,0)), List((c,0), (c,0))), (
                                                  //| c,8), (d,1), (e,6))
	
	('a',3) :: value2                         //> res23: List[(Char, Int)] = List((a,3), (c,8), (d,1), (e,6))
	
	List(1, 2, 3, 4, 5) map (x => List('s', x))
                                                  //> res24: List[List[Int]] = List(List(115, 1), List(115, 2), List(115, 3), Lis
                                                  //| t(115, 4), List(115, 5))
	List(1,2,3,4,5) take 1                    //> res25: List[Int] = List(1)
	List(0,1,2,3,4,5) drop 1                  //> res26: List[Int] = List(1, 2, 3, 4, 5)
  List() :: List()                                //> res27: List[List[Nothing]] = List(List())
}