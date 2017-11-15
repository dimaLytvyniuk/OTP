package com.lab111.labwork7;

public class Triangle extends Shape {
    protected Triangle(int x1, int y1, int x2, int y2, int color, int size) {
        super(x1, y1, x2, y2, color, size);
    }

    @Override
    public String toString() {
        return "Triangle: " + super.toString();
    }
}
