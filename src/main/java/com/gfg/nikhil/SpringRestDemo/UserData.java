package com.gfg.nikhil.SpringRestDemo;

import com.gfg.nikhil.SpringRestDemo.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserData {

    public static Map<Long, User> userMap =new HashMap<>();
    static{
        User user0 =new User(0L,"Nikhil","Sri");
        userMap.put(user0.getId(),user0);

        User user1 =new User(1L,"Nikhil","Sri");
        userMap.put(user1.getId(),user1);

        User user2 =new User(2L,"Nikhil","Sri");
        userMap.put(user2.getId(),user2);

        User user3 =new User(3L,"Nikhil","Sri");
        userMap.put(user3.getId(),user3);
    }
}
