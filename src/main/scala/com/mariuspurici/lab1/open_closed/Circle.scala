package com.mariuspurici.lab1.open_closed

import java.lang.Math.PI

class Circle(val radius: Double) extends Shape {
  override def Area: Double = radius * radius * PI
}
