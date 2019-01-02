package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void openSettingsFile() {
        Logger.getInstance().log("This is my login");
    }
    @Test
    public void testGetLastLog(){
        //Given
        //When
        String logName = logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("This is my login",logName);
    }
}