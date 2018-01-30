package com.example.jwts;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin Neag
 */

@RestController
public class UserController {

    @RequestMapping("/users")
    public @ResponseBody String getUsers() {
        return "{\"users\":[{\"firstname\":\"Charles\", \"lastname\":\"Smith\"}," +
                "{\"firstname\":\"Mike\",\"lastname\":\"Thompson\"}]}";
    }
}
