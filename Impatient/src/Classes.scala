import scala.beans.BeanProperty

object ch5 {
  def main(args: Array[String]): Unit = {

    val myCounter = new Counter();
    myCounter.increment()
    println(myCounter.current())

    val viren = new Person;
    viren.age = 31; // calls age_()
    println(viren.age) //calls age()
    
    val viru = new PersonA("viru", 18)
    println(viru.age);
  }
}

class Counter {
  private var value = 0;
  def increment() { value += 1 }
  def current() = value
}

class Person {

  @BeanProperty var age = 0; // generates complied class with age as private field and public method age() and age_()
  // @BeanProperty generates java style getters and setters in adiition scala ones as mentioned above

  private var name = ""

  def this(name: String) {
    this() //call to  primary constructor 
    this.name = name;
  }

  def this(name: String, age: Int) {
    this(name); // call to Auxillary constructor
    this.age = age;
  }

}

class PersonA(val name: String, var age: Int) {
  println("Just Constructed Another person");
}

class Message {
  val timestamp = new java.util.Date; // here no setter is generated as is defined as val
}

// private[this] - objects methods can not access 

