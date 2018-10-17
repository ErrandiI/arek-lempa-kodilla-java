package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private String shapeName;
    private double width;
    private double widthHigh;


    public Triangle(String shapeName, double width, double widthHigh) {
        this.shapeName = shapeName;
        this.width = width;
        this.widthHigh = widthHigh;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getShapeField() {
        return width * widthHigh * 0.5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.width, width) == 0 &&
                Double.compare(triangle.widthHigh, widthHigh) == 0 &&
                Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, width, widthHigh);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", width=" + width +
                ", widthHigh=" + widthHigh +
                '}';
    }
}
