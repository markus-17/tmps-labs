package com.mariuspurici.lab2.Prototype;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {}

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    public Rectangle clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle(" +
                    "x: " + this.x +
                    ", y: " + this.y +
                    ", color: " + this.color +
                    ", width: " + this.width +
                    ", height: " + this.height +
                ")";
    }
}
