package com.kodilla.testing.forum.shape;

import com.kodilla.testing.shape.Square;
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
    public void getShapeName(){
        //Given
        Square square  = new Square("kwadrat", 5);

        //When
        square.getShapeName("kwadrat");

        //Then
        Assert.assertEquals("kwadrat", square.getShapeName());
    }

    @Test
    public void getField(){

    }

    @Test
    public void addFigure(){

    }

    @Test
    public void removeFigure(){

    }

    @Test
    public void getFigure(){

    }


}