package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private String shapeName;
    private double r;
    private double Pi;


    public Circle(String shapeName, double r) {
        this.shapeName = shapeName;
        this.r = r;
        this.Pi = 3.14;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getShapeField() {
        return r * r * Pi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0 &&
                Double.compare(circle.Pi, Pi) == 0 &&
                Objects.equals(shapeName, circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, r, Pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", r=" + r +
                ", Pi=" + Pi +
                '}';
    }
}
