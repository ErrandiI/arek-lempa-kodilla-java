package com.kodilla.testing.forum.statistic;

import com.kodilla.testing.statistics.Statistics;

import java.util.Objects;

public class StatisticsCounter {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommmentsPerPost;
    private String counter;

    public StatisticsCounter(String counter) {
        this.counter = counter;
        this.numberOfComments = 0;
        this.numberOfPosts = 0;
        this.numberOfUsers = 0;
        this.avgPostsPerUser = 0;
        this.avgCommentsPerUser = 0;
        this.avgCommmentsPerPost = 0;
    }

    public String getCounter() {
        return counter;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommmentsPerPost() {
        return avgCommmentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

    }

    public void showStatisctics() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticsCounter that = (StatisticsCounter) o;
        return numberOfUsers == that.numberOfUsers &&
                numberOfPosts == that.numberOfPosts &&
                numberOfComments == that.numberOfComments &&
                Double.compare(that.avgPostsPerUser, avgPostsPerUser) == 0 &&
                Double.compare(that.avgCommentsPerUser, avgCommentsPerUser) == 0 &&
                Double.compare(that.avgCommmentsPerPost, avgCommmentsPerPost) == 0 &&
                Objects.equals(counter, that.counter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfUsers, numberOfPosts, numberOfComments, avgPostsPerUser, avgCommentsPerUser, avgCommmentsPerPost, counter);
    }

    @Override
    public String toString() {
        return "StatisticsCounter{" +
                "numberOfUsers=" + numberOfUsers +
                ", numberOfPosts=" + numberOfPosts +
                ", numberOfComments=" + numberOfComments +
                ", avgPostsPerUser=" + avgPostsPerUser +
                ", avgCommentsPerUser=" + avgCommentsPerUser +
                ", avgCommmentsPerPost=" + avgCommmentsPerPost +
                ", counter='" + counter + '\'' +
                '}';
    }



}
