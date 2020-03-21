package edu.birzeit.account.controller;


import edu.birzeit.account.dto.Business;
import edu.birzeit.account.dto.Resume;
import edu.birzeit.account.dto.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/businesses", produces = MediaType.APPLICATION_JSON_VALUE)
public class BusinessController {

    @RequestMapping(value = {"","/"}, method = RequestMethod.POST)
    public Business createBusiness(@RequestBody Business business){
        return new Business(business.getName());
    }
}
