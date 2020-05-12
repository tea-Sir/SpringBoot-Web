package org.teasir.paramconverter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public void hello(Date date){
        System.out.println(date);
    }
}
