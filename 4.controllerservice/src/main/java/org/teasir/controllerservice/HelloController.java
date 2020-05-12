package org.teasir.controllerservice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model){
        Map<String,Object> map=model.asMap();
        Set<String> set=map.keySet();
        for(String key:set){
            System.out.println(key+":"+map.get(key));
        }
        return "hello service";
    }

    @PostMapping("/book")
    public void addBook(@ModelAttribute("a") Book book,@ModelAttribute("b") Author author){
        System.out.println(book.toString());
        System.out.println(author.toString());
    }
}
