package com.kodilla.testing.forum.statistic;

import com.kodilla.testing.forum.statistics.Statistics;

import java.util.Objects;

public class StatisticsCounter {
    Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommmentsPerPost;


    public StatisticsCounter(Statistics statistics) {
        this.statistics = statistics;
        this.numberOfComments = 0;
        this.numberOfPosts = 0;
        this.numberOfUsers = 0;
        this.avgPostsPerUser = 0;
        this.avgCommentsPerUser = 0;
        this.avgCommmentsPerPost = 0;
    }

    public Statistics getStatistics() {
        return statistics;
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
        this.numberOfComments = statistics.commentsCount();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfUsers = statistics.usersNames().size();
        this.avgPostsPerUser = calculateAvgPostPerUsers();
        this.avgCommentsPerUser = calculateAvgCommentsPerUsers();
        this.avgCommmentsPerPost = calculateAvgCommentsPerPost();
    }

    private double calculateAvgPostPerUsers() {
        if (numberOfPosts > 0 && numberOfUsers > 0) {
            return numberOfUsers / numberOfPosts;
        } else {
            return 0;
        }
    }

    private double calculateAvgCommentsPerUsers() {
        if (numberOfComments > 0 && numberOfUsers > 0) {
            return numberOfUsers / numberOfComments;
        } else {
            return 0;
        }
    }

    private double calculateAvgCommentsPerPost() {
        if (numberOfComments > 0 && numberOfPosts > 0) {
            return numberOfPosts / numberOfComments;
        } else {
            return 0;
        }
    }

    public void showStatisctics() {
        System.out.println("Liczba użytkowników " + numberOfUsers);
        System.out.println("Liczba postów " + numberOfPosts);
        System.out.println("Liczba komentarzy " + numberOfComments);
        System.out.println("Srednia liczba postów na użytkownika " + avgPostsPerUser);
        System.out.println("Srednia liczba komentarzy na użytkownika " + avgCommentsPerUser);
        System.out.println("Srednia liczba komentarzy na post " + avgCommmentsPerPost);

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
                Objects.equals(statistics, that.statistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statistics, numberOfUsers, numberOfPosts, numberOfComments, avgPostsPerUser, avgCommentsPerUser, avgCommmentsPerPost);
    }

    @Override
    public String toString() {
        return "StatisticsCounter{" +
                "statistics=" + statistics +
                ", numberOfUsers=" + numberOfUsers +
                ", numberOfPosts=" + numberOfPosts +
                ", numberOfComments=" + numberOfComments +
                ", avgPostsPerUser=" + avgPostsPerUser +
                ", avgCommentsPerUser=" + avgCommentsPerUser +
                ", avgCommmentsPerPost=" + avgCommmentsPerPost +
                '}';
    }
}
