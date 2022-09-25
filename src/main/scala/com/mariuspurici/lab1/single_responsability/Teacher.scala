package com.mariuspurici.lab1.single_responsability

class Teacher(
    firstName: String,
    lastName: String,
    identificationNumber: String,
    fieldOfStudy: String
) extends Person(firstName, lastName, identificationNumber, "Teacher") {
  override def sayHello: String = super.sayHello + s", I teach $fieldOfStudy"
  override def getEmail: String = s"$firstName.$lastName@caltech.com"
}
