package com.mariuspurici.lab1

import com.mariuspurici.lab1.open_closed.{
  Shape,
  Circle,
  Rectangle,
  AreaCalculator
}
import com.mariuspurici.lab1.single_responsability.{Person, Student, Teacher}

object Main {
  println(Console.RED + "First Laboratory Work\n" + "-" * 64 + Console.RESET)
  println(
    Console.GREEN + "Single Responsability Principle\n" + "-" * 64 + Console.RESET
  )

  val listOfPeople: List[Person] = List(
    Person("John", "Cena", "3003884923175", "Professional Wrestler"),
    Student("Jack", "Brown", "488399928384981", "Computer Science"),
    Teacher("John", "Blue", "319983392837483", "Mathematics")
  )

  listOfPeople
    .flatMap { person =>
      List(person.sayHello, person.getEmail, person.getJob, "-" * 32)
    }
    .foreach(println)

  println(
    Console.GREEN + "-" * 64 + "\nOpen Closed Principle\n" + "-" * 64 + Console.RESET
  )

  val listOfShapes: List[Shape] = List(
    new Circle(2.0),
    new Rectangle(3.5, 2)
  )

  val totalArea = AreaCalculator(listOfShapes).compute

  println(s"The total area in listOfShapes is $totalArea")
}
