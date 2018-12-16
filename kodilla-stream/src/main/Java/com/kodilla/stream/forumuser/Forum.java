package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "piesoł", 'M', 2000, 5, 12, 30));
        userList.add(new ForumUser(2, "koteł", 'F', 1980, 12, 2, 130));
        userList.add(new ForumUser(3, "ptakieł", 'M', 1960, 5, 12, 75));
        userList.add(new ForumUser(4, "myszoł", 'F', 2005, 1, 7, 15));
        userList.add(new ForumUser(5, "fretka", 'F', 1985, 12, 2, 110));
        userList.add(new ForumUser(6, "krecik", 'M', 1969, 7, 23, 80));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}