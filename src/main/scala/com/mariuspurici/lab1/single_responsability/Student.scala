package com.mariuspurici.lab1.single_responsability

class Student(
    firstName: String,
    lastName: String,
    identificationNumber: String,
    major: String
) extends Person(firstName, lastName, identificationNumber, "Student") {
  override def sayHello: String = super.sayHello + s", I study $major"
  override def getEmail: String = s"$firstName.$lastName@student.com"
}
