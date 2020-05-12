package org.teasir.controllerservice;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalData {
    @ModelAttribute("info")
    public Map<String,Object> mydata(){
        Map<String,Object> map=new HashMap<>();
        map.put("id","1");
        map.put("name","三国演义");
        return map;
    }

    /*
    * 请求参数预处理
    * */
    @InitBinder("a")
    public void initA(WebDataBinder binder){
        binder.setFieldDefaultPrefix("a.");
    }
    @InitBinder("b")
    public void initB(WebDataBinder binder){
        binder.setFieldDefaultPrefix("b.");
    }
}
