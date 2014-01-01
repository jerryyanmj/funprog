package week6

object forexp {

def isPrime(n: Int): Boolean = (2 until n) forall (x=> n%x != 0)
                                                  //> isPrime: (n: Int)Boolean

	((("abcaddcffffg") groupBy( x => x)).toList map (pair => (pair._1, pair._2.length))).sorted
                                                  //> res0: List[(Char, Int)] = List((a,2), (b,1), (c,2), (d,2), (f,4), (g,1))
	val n = 7                                 //> n  : Int = 7
	(1 until n) map (i => (1 until i) map (j=>(i,j)))
                                                  //> res1: scala.collection.immutable.IndexedSeq[scala.collection.immutable.Index
                                                  //| edSeq[(Int, Int)]] = Vector(Vector(), Vector((2,1)), Vector((3,1), (3,2)), V
                                                  //| ector((4,1), (4,2), (4,3)), Vector((5,1), (5,2), (5,3), (5,4)), Vector((6,1)
                                                  //| , (6,2), (6,3), (6,4), (6,5)))
	((1 until n) map (i => (1 until i) map (j=>(i,j)))).flatten
                                                  //> res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,1
                                                  //| ), (3,2), (4,1), (4,2), (4,3), (5,1), (5,2), (5,3), (5,4), (6,1), (6,2), (6,
                                                  //| 3), (6,4), (6,5))
	
	
	(1 until n) flatMap (i => (1 until i) map (j=>(i,j)))
                                                  //> res3: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,1
                                                  //| ), (3,2), (4,1), (4,2), (4,3), (5,1), (5,2), (5,3), (5,4), (6,1), (6,2), (6,
                                                  //| 3), (6,4), (6,5))
	(1 until n) flatMap (i => (1 until i) map (j=>(i,j))) filter (pair => isPrime(pair._1 + pair._2))
                                                  //> res4: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
	
	
	for {
		i <- 1 until n
		j <- 1 until i
		if isPrime(i+j)
	} yield (i,j)                             //> res5: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))
	def scalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double = {
		
		(for ( (x,y) <- xs zip ys ) yield x * y).sum
	
	}                                         //> scalarProduct2: (xs: Vector[Double], ys: Vector[Double])Double
	
	val v1 = Vector(1d,2d,3d,4d)              //> v1  : scala.collection.immutable.Vector[Double] = Vector(1.0, 2.0, 3.0, 4.0)
                                                  //| 
  val v2 = Vector(1d,2d,3d,4d)                    //> v2  : scala.collection.immutable.Vector[Double] = Vector(1.0, 2.0, 3.0, 4.0)
                                                  //| 
  scalarProduct2(v1, v2)                          //> res6: Double = 30.0
  
}