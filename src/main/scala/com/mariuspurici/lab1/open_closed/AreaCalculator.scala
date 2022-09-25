package com.mariuspurici.lab1.open_closed

// Does NOT Respect the Open Closed Principle
/*

class AreaCalculator(listOfRectangles: List[Rectangle]) {
  def compute: Double = listOfRectangles.map(r => r.height * r.width).sum
}

*/

// Respects the Open Closed Principle
class AreaCalculator(listOfShapes: List[Shape]) {
  def compute: Double = listOfShapes.map(_.Area).sum
}
