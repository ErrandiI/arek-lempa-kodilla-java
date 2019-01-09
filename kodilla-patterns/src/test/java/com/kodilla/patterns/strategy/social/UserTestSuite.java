package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.YGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevenShouldUse = steven.sharePost();
        System.out.println("Steven should use: " + stevenShouldUse);
        String johnShouldUse = john.sharePost();
        System.out.println("John should use: " + johnShouldUse);
        String kodillaShouldUse = kodilla.sharePost();
        System.out.println("Kodilla should use: " + kodillaShouldUse);

        //Then
        Assert.assertEquals("[FB publisher] Posted post on Facebook", stevenShouldUse);
        Assert.assertEquals("[Twitter publisher] Posted post on Twitter", johnShouldUse);
        Assert.assertEquals("[Snapchat publisher] Posted post on Snapchat", kodillaShouldUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenShouldUse = steven.sharePost();
        System.out.println("Steven should use: " + stevenShouldUse);
        steven.setSocialMedia(new TwitterPublisher());
        stevenShouldUse = steven.sharePost();
        System.out.println("Steven now should: " + stevenShouldUse);

        //Then
        Assert.assertEquals("[Twitter publisher] Posted post on Twitter", stevenShouldUse);
    }
}
