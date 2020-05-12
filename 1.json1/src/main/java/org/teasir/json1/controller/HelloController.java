package org.teasir.json1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.teasir.json1.bean.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public List<User> getUsers(){
        List<User> users=new ArrayList<>();
        for(int i=0;i<5;i++){
            User user=new User();
            user.setId(i);
            user.setName("tea-Sir"+i);
            user.setBirthday(new Date());
            users.add(user);
        }
        return users;
    }
}
