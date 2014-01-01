package forcomp

object x {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(112); 
  
  val words = loadDictionary filter (word => word forall (char => char.isLetter));System.out.println("""words  : List[String] = """ + $show(words ));$skip(141); 

  val mnem = Map(
    '2' -> "ABC", '3' -> "DEF", '4' -> "GHI", '5' -> "JKL",
    '6' -> "MNO", '7' -> "PQRS", '8' -> "TUV", '9' -> "WXYZ");System.out.println("""mnem  : scala.collection.immutable.Map[Char,String] = """ + $show(mnem ));$skip(179); 

  /** Invert the mnem map to give a map from chars 'A' ... 'Z' to '2' .. '9' */
  val charCode: Map[Char, Char] =
    for ((num, chars) <- mnem; char <- chars) yield char -> num;System.out.println("""charCode  : Map[Char,Char] = """ + $show(charCode ));$skip(155); 

  /** Maps a word to the digit string it can represent, e.g. "Java" -> "5282" */
  def wordCode(word: String): String =
    word.toUpperCase map charCode;System.out.println("""wordCode: (word: String)String""");$skip(20); val res$0 = 

  wordCode("JAvA");System.out.println("""res0: String = """ + $show(res$0));$skip(97); 

  val wordsForNum: Map[String, Seq[String]] =
    words groupBy wordCode withDefaultValue Seq();System.out.println("""wordsForNum  : Map[String,Seq[String]] = """ + $show(wordsForNum ));$skip(274); 

  def encode(number: String): Set[List[String]] =
    if (number.isEmpty) Set(List())
    else {
      for {
        split <- 1 to number.length
        word <- wordsForNum(number take split)
        rest <- encode(number drop split)
      } yield word :: rest
    }.toSet;System.out.println("""encode: (number: String)Set[List[String]]""");$skip(30); val res$1 = 
    
    encode("7225247386");System.out.println("""res1: Set[List[String]] = """ + $show(res$1))}
}
