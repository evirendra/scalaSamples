import scala.collection.mutable.HashMap

object ch4 {

  def main(args: Array[String]): Unit = {

    //immutable Map

    var scores = Map("Virendra" -> 10, "viru" -> 10, "rintoo" -> 10, "viren" -> 10)
    println(scores);

    val mutableScore = scala.collection.mutable.Map("Virendra" -> 10, "viru" -> 10, "rintoo" -> 10, "viren" -> 10)
    println(mutableScore);

    val initScores = new scala.collection.mutable.HashMap[String, Int]

    var viruscore = scores("viru");
    println(viruscore);

    viruscore = if (scores.contains("viru1")) scores("viru") else 0;

    viruscore = scores.getOrElse("viru1", 0);
    println(viruscore)

    mutableScore("viru") = 11;

    viruscore = mutableScore.getOrElse("viru", 0);
    println(viruscore)

    mutableScore("new") = 7;
    println(mutableScore)

    mutableScore += ("new1" -> 8, "new2" -> 9);
    println(mutableScore)

    mutableScore -= "new2"
    println(mutableScore)

    // immutable 
    val newScore = scores + ("new4" -> 3, "new5" -> 4)
    println(newScore)
    println(scores);
    scores = scores + ("new4" -> 3, "new5" -> 4)
    println(scores);
    
    for((k,v)<- scores) {
      println(k)
      println(v)
    }
    
    
    // Trees  == sorted Map
    
    
    // tuples

    val t = (1, 3.14, "viren")
    println(t);
    
    println(t._2)

  }
}