package week8

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val f: PartialFunction[String, String] = { case "ping" => "pang" }
                                                  //> f  : PartialFunction[String,String] = <function1>
  
  f("ping")                                       //> res0: String = pang
  f.isDefinedAt("abc")                            //> res1: Boolean = false
  f.isDefinedAt("ping")                           //> res2: Boolean = true
  
  val g: PartialFunction[List[Int], String] = {
  
  	case Nil => "One"
  	case x :: y :: rest => "two"
  }                                               //> g  : PartialFunction[List[Int],String] = <function1>
  
  g.isDefinedAt(List(1,2,3))                      //> res3: Boolean = true
  g(List(1,2,3))                                  //> res4: String = two
  
  val g2: PartialFunction[List[Int], String] = {
  
  	case Nil => "One"
  	case x :: rest =>
  		rest match {
  			case Nil => "two"
  		}
  }                                               //> g2  : PartialFunction[List[Int],String] = <function1>
  
  g2.isDefinedAt(List(1,2,3))                     //> res5: Boolean = true
  //g2(List(1,2,3))  // will give error
  
}