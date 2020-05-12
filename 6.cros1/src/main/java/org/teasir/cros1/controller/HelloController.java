package org.teasir.cros1.controller;

import org.springframework.boot.origin.Origin;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    /*
    * CrossOrigin同意接收跨域请求
    * */
    //@CrossOrigin(origins="http://localhost:8081")
    public String hello(){
        return "hello";
    }
}
