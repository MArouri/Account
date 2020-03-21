package edu.birzeit.account.controller;


import edu.birzeit.account.dto.Resume;
import edu.birzeit.account.dto.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @RequestMapping(value = {"/{userId}"}, method = RequestMethod.GET)
    public User getUerById(@PathVariable Long userId) {
        return new User(userId);
    }

    @RequestMapping(value = {"","/"}, method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return new User(user.getName());
    }

    @RequestMapping(value = {"/{userId}/resume/parse"}, method = RequestMethod.POST)
    public Resume parseUserResume(@PathVariable Long userId) {
        return new Resume(userId);
    }
}
