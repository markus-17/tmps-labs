package com.mariuspurici.lab1.single_responsability

class Person(
    firstName: String,
    lastName: String,
    identificationNumber: String,
    occupation: String
) {
  def sayHello: String =
    s"Hello my name is $firstName $lastName, my id is $identificationNumber"
  def getEmail: String = s"$firstName.$lastName@gmail.com"
  def getJob: String = occupation
}
