package com.lab111.labwork7;

public class Rectangle extends Shape {
    protected Rectangle(int x1, int y1, int x2, int y2, int color, int size) {
        super(x1, y1, x2, y2, color, size);
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.toString();
    }
}
