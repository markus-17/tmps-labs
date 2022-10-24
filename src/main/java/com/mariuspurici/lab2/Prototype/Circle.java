package com.mariuspurici.lab2.Prototype;

public class Circle extends Shape {
    public int radius;

    public Circle() {}

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle(" +
                    "x: " + this.x +
                    ", y: " + this.y +
                    ", color: " + this.color +
                    ", radius: " + this.radius +
                ")";
    }
}
