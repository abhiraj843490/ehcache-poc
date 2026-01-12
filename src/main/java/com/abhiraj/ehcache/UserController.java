package com.abhiraj.ehcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/name/{firstname}")
    public String getSquare(@PathVariable String firstname) {
        System.out.println("call numberService to square {}"+ firstname);
        return String.format("{\"name\": %s}", userService.getUser(firstname));
    }
}
