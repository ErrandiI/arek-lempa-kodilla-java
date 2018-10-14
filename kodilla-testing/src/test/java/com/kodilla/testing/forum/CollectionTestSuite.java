package com.kodilla.testing.forum;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given

        OddNumbersExterminator oddNumbersExterminator1 = new OddNumbersExterminator();
        ArrayList<Integer> myList = new ArrayList<>();

        ArrayList<Integer> myList2 = new ArrayList<>();

        //When
        ArrayList<Integer> resultList = oddNumbersExterminator1.exterminate(myList);
        System.out.println("Testing " + oddNumbersExterminator1);
        //Then
        Assert.assertEquals(myList2, resultList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList () {
        //Given

        OddNumbersExterminator oddNumbersExterminator2 = new OddNumbersExterminator();
        ArrayList<Integer> myList7 = new ArrayList<>();
        myList7.add(10);
        myList7.add(3);
        myList7.add(17);
        myList7.add(14);

        ArrayList<Integer> myList3 = new ArrayList<>();
        myList3.add(10);
        myList3.add(14);
        //When
        ArrayList<Integer> resultList = oddNumbersExterminator2.exterminate(myList7);
        System.out.println("Testing " + oddNumbersExterminator2);
        //Then
        Assert.assertEquals(myList3, resultList);
    }
}
