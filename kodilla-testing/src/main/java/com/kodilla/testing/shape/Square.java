package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    private Shape shapeName;
    private double field;


    public Square(Shape shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;
    }
    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public double getField() {
        return field * field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.field, field) == 0 &&
                Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, field);
    }
}
