package com.gfg.nikhil.SpringRestDemo.controller;

import com.gfg.nikhil.SpringRestDemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.gfg.nikhil.SpringRestDemo.UserData.userMap;

@RestController
public class UserController {

    @PostMapping("/user")
    public Boolean createUser(@RequestBody User user){

        if(userMap.containsKey(user.getId())){
            return false;
        }
        else{
            userMap.put(user.getId(),user);
            return true;
        }
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){

        List<User> users=new ArrayList<>();

        for(Map.Entry<Long,User> userEntry: userMap.entrySet()){

            users.add(userEntry.getValue());
        }

        return users;

    }

    @PutMapping("/user")
    public Boolean updateUser(@RequestBody User user){

        Long id=user.getId();
        if(userMap.containsKey(id)){
            userMap.put(id,user);
            return true;
        }
        else{
            return false;
        }
    }

    @DeleteMapping("/user/{id}")
    public Boolean deleteUser(@PathVariable("id") Long id){

        if(userMap.containsKey(id)){

            userMap.remove(id);
            return true;
        }
        else{
            return false;
        }
    }
}
