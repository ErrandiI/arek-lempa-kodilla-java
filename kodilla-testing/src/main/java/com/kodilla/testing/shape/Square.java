package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private String shapeName;
    private double width;


    public Square(String shapeName, double width) {
        this.shapeName = shapeName;
        this.width = width;
    }

    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public double getShapeField() {
        return width * width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.width, width) == 0 &&
                Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", width=" + width +
                '}';
    }
}
