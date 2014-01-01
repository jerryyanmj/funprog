package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    
    if (r ==0 || r == 1 || c == 0 || c == r) 1
    else pascal(c-1, r-1) + pascal(c,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanced(input : List[Char], stack : List[Char]) : Boolean = {
      if (input.isEmpty) {
        //println("reach the end of the input and check stack " + stack + " is empty or not " + stack.isEmpty)
        stack.isEmpty
      }
      else if (input.head == '(') {
        //println("first element of input is " + input.head + ", keep going with " + input.tail + " and " + List.concat(stack, List(input.head)))
        balanced(input.tail, List.concat(stack, List(input.head)))
      }
      else if (input.head == ')') {
        //println("first element of input is " + input.head + ", keep going with " + input.tail + " and " + stack.take(stack.size - 1))
        !stack.isEmpty && (input.head == ')' && stack.last == '(') && balanced(input.tail, stack.take(stack.size - 1))
      }
      else {
        //println(input.head + " is not ( or ), keep going with " + input.tail + " and " + stack)
        balanced(input.tail, stack)
      }
    }
    
    balanced(chars, List[Char]())
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
