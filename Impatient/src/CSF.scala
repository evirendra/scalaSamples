import scala.math._
import scala.io.StdIn._

object ch2 {

  def main(args: Array[String]): Unit = {
    val x = 1;

    val s = if (x > 0) 1 else -1

    //Any

    //Unit

    // value of block is the value of last expression

    val distance = { val dx = 5 - 1; val dy = 4 - 2; sqrt(dx * dx + dy * dy) }
    println(distance)

    for (i <- 1 to 10) {
      println(i)
    }

    for (i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + " ")
    println();
    for (i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + " ")
    println

    for (i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j) + " ")
    println

    for (i <- 1 to 3; from = 4 - i; j <- from to 3 if i != j) print((10 * i + j) + " ")
    println

    val vector = for (i <- 1 to 10) yield i % 3;
    println(vector);

        //functions
    
   val sumResult = sum (1,4,9,20)
   println(sumResult)
   
   box("Hello");
   
   //val - evaluated as soon as defined
   // lazy val = evluated when used  first time 
   // def = evaluated everytime used.
    
    val name = readLine("Your name:")
    print("your age:");
    val age = readInt();
    printf("Hello %s!, next year you will be %d!", name, age + 1);



  }

  def abs(x: Double) = if (x >= 0) x else -x

  def fac(n: Int) = {
    var r = 1;
    for (i <- 1 to n) r = r * i
    r
  }

  def facRec(n: Int): Int = if (n <= 0) 1 else n * facRec(n - 1)

  def decorate(str: String, left: String = "[", right: String = "]") = left + str + right

  // varibale Argument

  def sum(args: Int*) = {
    var result = 0;
    for (arg <- args) result += arg;
    result;
  }
  
  def box(s:String) {
    val border = "-" * s.length + "--\n";
    println(border +  "|" +  s + "|\n" +  border);
  }

}