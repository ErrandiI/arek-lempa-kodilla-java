package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistic.StatisticsCounter;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    private static int testCounter = 0;

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void calculateAdvStatisticsUserCount0() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> listName = new ArrayList<>();


        when(statisticMock.usersNames()).thenReturn(listName);
        when(statisticMock.commentsCount()).thenReturn(5);
        when(statisticMock.postsCount()).thenReturn(100);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticMock);
        //Then
        statisticsCounter.showStatisctics();
        Assert.assertEquals(20, statisticsCounter.getAvgCommmentsPerPost(), 0.1);
        Assert.assertEquals(0, statisticsCounter.getAvgPostsPerUser(), 0.1);
        Assert.assertEquals(0, statisticsCounter.getAvgCommentsPerUser(), 0.1);
    }

    @Test
    public void calculateAdvStatisticsUserCount100() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> listName = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listName.add("name" + i);
        }

        when(statisticMock.usersNames()).thenReturn(listName);
        when(statisticMock.commentsCount()).thenReturn(100);
        when(statisticMock.postsCount()).thenReturn(100);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticMock);
        //Then
        statisticsCounter.showStatisctics();
        Assert.assertEquals(1, statisticsCounter.getAvgCommmentsPerPost(), 0.1);
        Assert.assertEquals(1, statisticsCounter.getAvgPostsPerUser(), 0.1);
        Assert.assertEquals(1, statisticsCounter.getAvgCommentsPerUser(), 0.1);
    }

    @Test
    public void calculateAdvStatisticsPostCount0() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> listName = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listName.add("name" + i);
        }

        when(statisticMock.usersNames()).thenReturn(listName);
        when(statisticMock.commentsCount()).thenReturn(100);
        when(statisticMock.postsCount()).thenReturn(0);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticMock);
        //Then
        statisticsCounter.showStatisctics();
        Assert.assertEquals(0, statisticsCounter.getAvgCommmentsPerPost(), 0.1);
        Assert.assertEquals(0, statisticsCounter.getAvgPostsPerUser(), 0.1);
        Assert.assertEquals(1, statisticsCounter.getAvgCommentsPerUser(), 0.1);
    }

    @Test
    public void calculateAdvStatisticsPostCount1000() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> listName = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            listName.add("name" + i);
        }

        when(statisticMock.usersNames()).thenReturn(listName);
        when(statisticMock.commentsCount()).thenReturn(1000);
        when(statisticMock.postsCount()).thenReturn(1000);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticMock);
        //Then
        statisticsCounter.showStatisctics();
        Assert.assertEquals(1, statisticsCounter.getAvgCommmentsPerPost(), 0.1);
        Assert.assertEquals(1, statisticsCounter.getAvgPostsPerUser(), 0.1);
        Assert.assertEquals(1, statisticsCounter.getAvgCommentsPerUser(), 0.1);
    }

    @Test
    public void calculateAdvStatisticsCommentsCount0() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> listName = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listName.add("name" + i);
        }

        when(statisticMock.usersNames()).thenReturn(listName);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.postsCount()).thenReturn(100);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticMock);
        //Then
        statisticsCounter.showStatisctics();
        Assert.assertEquals(0, statisticsCounter.getAvgCommmentsPerPost(), 0.1);
        Assert.assertEquals(1, statisticsCounter.getAvgPostsPerUser(), 0.1);
        Assert.assertEquals(0, statisticsCounter.getAvgCommentsPerUser(), 0.1);
    }

    @Test
    public void calculateAdvStatisticsCommentsCountLowerThanPostsCount() {
        //Given
        Statistics statisticMock = mock(Statistics.class);

        when(statisticMock.commentsCount()).thenReturn(50);
        when(statisticMock.postsCount()).thenReturn(100);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticMock);
        //Then
        statisticsCounter.showStatisctics();
        Assert.assertEquals(2, statisticsCounter.getAvgCommmentsPerPost(), 0.1);
        Assert.assertEquals(0, statisticsCounter.getAvgPostsPerUser(), 0.1);
        Assert.assertEquals(0, statisticsCounter.getAvgCommentsPerUser(), 0.1);
    }

    @Test
    public void calculateAdvStatisticsCommentsCountHigherThanPostsCount() {
        //Given
        Statistics statisticMock = mock(Statistics.class);

        when(statisticMock.commentsCount()).thenReturn(500);
        when(statisticMock.postsCount()).thenReturn(450);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticMock);
        //Then
        statisticsCounter.showStatisctics();
        Assert.assertEquals(0.5, statisticsCounter.getAvgCommmentsPerPost(), 0.5);
        Assert.assertEquals(0, statisticsCounter.getAvgPostsPerUser(), 0.1);
        Assert.assertEquals(0, statisticsCounter.getAvgCommentsPerUser(), 0.1);
    }
}
