package week5

object map {

	val nums = List(1D,2D,3D)                 //> nums  : List[Double] = List(1.0, 2.0, 3.0)

	val nums2 = List(12,34,55,13)             //> nums2  : List[Int] = List(12, 34, 55, 13)

	def scaleList(xs: List[Double], factor: Double) =
		xs map (x=> x * factor)           //> scaleList: (xs: List[Double], factor: Double)List[Double]
		
	def squareList(xs: List[Int]): List[Int] = xs match {
		case Nil => Nil
		case y :: ys => y*y :: squareList(ys)
	}                                         //> squareList: (xs: List[Int])List[Int]
	
	def squareList2(xs: List[Int]): List[Int] =
		xs map (x => x*x)                 //> squareList2: (xs: List[Int])List[Int]

	scaleList(nums, 10)                       //> res0: List[Double] = List(10.0, 20.0, 30.0)
	squareList(nums2)                         //> res1: List[Int] = List(144, 1156, 3025, 169)
	squareList2(nums2)                        //> res2: List[Int] = List(144, 1156, 3025, 169)
}