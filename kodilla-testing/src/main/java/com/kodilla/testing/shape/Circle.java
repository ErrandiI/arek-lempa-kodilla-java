package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private Shape shapeName;
    private int r;
    private double Pi;


    public Circle(Shape shapeName, int r) {
        this.shapeName = shapeName;
        this.r = r;
        this.Pi = 3.14;
    }
    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public double getField() {
        return (r * r * Pi);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return r == circle.r &&
                Double.compare(circle.Pi, Pi) == 0 &&
                Objects.equals(shapeName, circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, r, Pi);
    }
}
