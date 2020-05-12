package org.teasir.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public void hello(){
        int a=2/0;
        System.out.println(a);
    }
}
