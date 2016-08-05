import scala.collection.mutable.ArrayBuffer

object ch3 {
  def main(args: Array[String]): Unit = {

    val nums = new Array[Int](10);

    val s = Array("Hello", "World");
    s(0) = "GoodBye"

    val b = new ArrayBuffer[Int]()
    b += 1;
    b += (1, 2, 3, 4, 5, 6)
    b ++= Array(8, 5, 13)

    println(b);

    val result = for (elem <- b) yield 2 * elem
    println(result);

    val even = for (elem <- b if elem % 2 == 0) yield 2 * elem;
    println(even);

    println(b.filter { _ % 2 == 0 }.map(2 * _))

    println(Array(1, 4, 7, 9).sum)

    println(Array(1, 4, 7, 9).min)
    println(Array(1, 4, 7, 9).max)

    val z = Array(1, 7, 2, 9);
    scala.util.Sorting.quickSort(z);
    println(z.mkString(" and "));

  }
}