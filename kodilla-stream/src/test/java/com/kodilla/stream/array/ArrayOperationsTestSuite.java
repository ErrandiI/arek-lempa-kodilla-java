package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        //Given
        int[] table = new int[20];

        for (int i = 0; i < 20; i++)
            table[i] = i + 1;

        //When
        double average = ArrayOperations.getAverage(table);
        System.out.println("Srednia z tablicy[i] to " + average);
        //Then
        Assert.assertEquals(10.5, average, 0.001);
    }
}
