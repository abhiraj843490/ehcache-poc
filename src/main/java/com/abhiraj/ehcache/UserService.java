package com.abhiraj.ehcache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Cacheable(
            value = "named",
            key = "#name")
    public String getUser(String name) {
        String fullName = name + " verma";
        System.out.println(("Now full name of "+name + "is :"+ fullName));
        return fullName;
    }
}
