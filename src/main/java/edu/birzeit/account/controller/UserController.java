package edu.birzeit.account.controller;

import edu.birzeit.account.dto.Resume;
import edu.birzeit.account.dto.User;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @RequestMapping(value = {"/{userId}"}, method = RequestMethod.GET)
    public User getUerById(Authentication authentication,@PathVariable Long userId) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return new User(userId,userDetails.getUsername());
    }

    @RequestMapping(value = {"","/"}, method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return new User(user.getName());
    }

    @RequestMapping(value = {"/{userId}/resume/parse"}, method = RequestMethod.POST)
    public Resume parseUserResume(Authentication authentication,@PathVariable Long userId) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return new Resume(userId,userDetails.getUsername());
    }
}
