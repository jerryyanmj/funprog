package week6

object settest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val fruit = Set("apple", "banana", "pear")      //> fruit  : scala.collection.immutable.Set[String] = Set(apple, banana, pear)
  
  val s = (1 to 6).toSet                          //> s  : scala.collection.immutable.Set[Int] = Set(5, 1, 6, 2, 3, 4)
  
  s map (_ + 2)                                   //> res0: scala.collection.immutable.Set[Int] = Set(5, 6, 7, 3, 8, 4)
  
  s.nonEmpty                                      //> res1: Boolean = true
  
  s map (_ / 2)                                   //> res2: scala.collection.immutable.Set[Int] = Set(2, 0, 3, 1)
  
  s contains 5                                    //> res3: Boolean = true
}