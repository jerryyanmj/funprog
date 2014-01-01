package week7

object test {
  val problem = new Pouring(Vector(4, 9, 19))     //> problem  : week7.Pouring = week7.Pouring@53546fcd
  
  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with we
                                                  //| ek7.test.problem.Move] = Vector(Empty(0), Empty(1), Empty(2), Fill(0), Fill(1
                                                  //| ), Fill(2), Pour(0,1), Pour(0,2), Pour(1,0), Pour(1,2), Pour(2,0), Pour(2,1))
                                                  //| 
  
  problem.solution(17).take(10).toList            //> res1: List[week7.test.problem.Path] = List(Fill(1) Pour(0,2) Fill(0) Pour(0,
                                                  //| 2) Fill(0) Pour(0,2)--> Vector(0, 0, 17), Fill(0) Pour(0,2) Fill(0) Pour(0,2
                                                  //| ) Fill(1) Pour(0,2)--> Vector(0, 0, 17), Fill(0) Pour(0,2) Fill(1) Pour(0,2)
                                                  //|  Fill(0) Pour(0,2)--> Vector(0, 0, 17), Fill(2) Pour(2,0) Empty(0) Pour(2,0)
                                                  //|  Fill(2) Pour(1,0) Pour(2,1)--> Vector(4, 9, 17), Fill(1) Pour(1,0) Pour(0,2
                                                  //| ) Fill(1) Pour(0,2) Pour(1,0) Pour(0,2)--> Vector(0, 1, 17), Fill(2) Pour(2,
                                                  //| 0) Fill(2) Pour(2,0) Empty(0) Pour(2,1) Pour(2,0)--> Vector(4, 9, 17), Fill(
                                                  //| 0) Pour(0,2) Fill(2) Pour(1,0) Pour(0,2) Fill(1) Pour(0,2)--> Vector(0, 15, 
                                                  //| 17), Fill(2) Pour(1,0) Empty(0) Pour(2,1) Pour(2,0) Fill(2) Pour(2,0)--> Vec
                                                  //| tor(4, 9, 17), Fill(2) Pour(1,0) Empty(0) Pour(0,1) Pour(2,0) Fill(2) Pour(2
                                                  //| ,0)--> Vector(4, 9, 17), Fill(2) Pour(2,0) Fill(2) Pour(1,0) Empty(0) Pour(2
                                                  //| ,1) Pour(2,0)--> Vector(4, 9, 17))
  
}