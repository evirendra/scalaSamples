import scala.math._

object ch1 {
  def main(args: Array[String]): Unit = {
    //constant
    val str = "testing";
    println(str);

    //variable
    var number = 1;
    number = 2;
    println(number)

    val answer = 8 * 5 + 2
    println(answer);

    println(1.toString())
    println(1.to(10))

    println("Hello".intersect("World"));

    //a+b == a.+(b)

    val x: BigInt = 1234567;
    println(x * x * x);

    println(sqrt(2))

    println("Hello".distinct);

    println("Hello"(4))

    println("Hello".apply(4));

  }
}