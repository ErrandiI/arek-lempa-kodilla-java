package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddAndGetFigure(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        //When
        sc.addFigure(new Circle("koło", 5));
        Shape resultShape = sc.getFigure(0);
        //Then
        sc.showFigures();
        Assert.assertEquals("koło", resultShape.getShapeName());

    }

    @Test
    public void removeFigure(){
        //Given
        ShapeCollector sc = new ShapeCollector();
        sc.addFigure(new Square("kwadrat", 5));
        sc.addFigure(new Triangle("trójkąt", 5, 10));
        sc.showFigures();
        sc.removeFigure(new Square("kwadrat", 5));
        //When
        Shape resultShape = sc.getFigure(0);
        //Then
        sc.showFigures();
        Assert.assertEquals("trójkąt", resultShape.getShapeName());
    }

}