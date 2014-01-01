package week5

object books {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  case class Book(title: String, authors: List[String])
  
  val books: List[Book] = List(
		Book(title = "Structure and Interpretation of Computer Programs",
		authors = List("Abelson, Harald", "Sussman, Gerald J.")),
		Book(title = "Introduction to Functional Programming",
		authors = List("Bird, Richard", "Wadler, Phil")),
		Book(title = "Effective Java",
		authors = List("Bloch, Joshua")),
		Book(title = "Effective Java 2",
		authors = List("Bloch, Joshua")),
		Book(title = "Java Puzzlers",
		authors = List("Bloch, Joshua", "Gafter, Neal")),
		Book(title = "Programming in Scala",
		authors = List("Odersky, Martin", "Spoon, Lex", "Venners, Bill")))
                                                  //> books  : List[week5.books.Book] = List(Book(Structure and Interpretation of 
                                                  //| Computer Programs,List(Abelson, Harald, Sussman, Gerald J.)), Book(Introduct
                                                  //| ion to Functional Programming,List(Bird, Richard, Wadler, Phil)), Book(Effec
                                                  //| tive Java,List(Bloch, Joshua)), Book(Effective Java 2,List(Bloch, Joshua)), 
                                                  //| Book(Java Puzzlers,List(Bloch, Joshua, Gafter, Neal)), Book(Programming in S
                                                  //| cala,List(Odersky, Martin, Spoon, Lex, Venners, Bill)))
	
	val booksset: Set[Book] = Set(
		Book(title = "Structure and Interpretation of Computer Programs",
		authors = List("Abelson, Harald", "Sussman, Gerald J.")),
		Book(title = "Introduction to Functional Programming",
		authors = List("Bird, Richard", "Wadler, Phil")),
		Book(title = "Effective Java",
		authors = List("Bloch, Joshua")),
		Book(title = "Effective Java 2",
		authors = List("Bloch, Joshua")),
		Book(title = "Java Puzzlers",
		authors = List("Bloch, Joshua", "Gafter, Neal")),
		Book(title = "Programming in Scala",
		authors = List("Odersky, Martin", "Spoon, Lex", "Venners, Bill")))
                                                  //> booksset  : Set[week5.books.Book] = Set(Book(Effective Java 2,List(Bloch, J
                                                  //| oshua)), Book(Programming in Scala,List(Odersky, Martin, Spoon, Lex, Venner
                                                  //| s, Bill)), Book(Structure and Interpretation of Computer Programs,List(Abel
                                                  //| son, Harald, Sussman, Gerald J.)), Book(Effective Java,List(Bloch, Joshua))
                                                  //| , Book(Introduction to Functional Programming,List(Bird, Richard, Wadler, P
                                                  //| hil)), Book(Java Puzzlers,List(Bloch, Joshua, Gafter, Neal)))
		
		for (b <- books; a <- b.authors if a startsWith "Bloch,") yield b.title
                                                  //> res0: List[String] = List(Effective Java, Effective Java 2, Java Puzzlers)
                                                  //| 
		
		for {
			b1 <- books
			b2 <- books
			if b1.title < b2.title
			a1 <- b1.authors
			a2 <- b2.authors
			if a1 == a2
		} yield a1                        //> res1: List[String] = List(Bloch, Joshua, Bloch, Joshua, Bloch, Joshua)
		
		
		for {
			b1 <- booksset
			b2 <- booksset
			if b1.title < b2.title
			a1 <- b1.authors
			a2 <- b2.authors
			if a1 == a2
		} yield a1                        //> res2: scala.collection.immutable.Set[String] = Set(Bloch, Joshua)
		
		
		
		
  
}