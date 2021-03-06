package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear() <= 2018 - 20)
                .filter(forumUser -> forumUser.getPostCounter() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));
        for (Map.Entry<Integer, ForumUser> entry : forumMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        // System.out.println(forumMap);
    }
}