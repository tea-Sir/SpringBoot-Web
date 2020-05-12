package org.teasir.json1.config;

//import com.fasterxml.jackson.databind.ObjectMapper;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.text.SimpleDateFormat;

@Configuration
public class MvcConfig {
    /*
     * json格式转化
     * */
 /*   @Bean
    MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
        MappingJackson2HttpMessageConverter mj2=new MappingJackson2HttpMessageConverter();
        ObjectMapper om=new ObjectMapper();
        om.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        mj2.setObjectMapper(om);
        return mj2;
    }*/

 /*   @Bean
    ObjectMapper objectMapper(){
        ObjectMapper om=new ObjectMapper();
        om.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
        return om;
    }*/
    /*
     * gson转化json，有需要可以配置。
     * */
/* @Bean
    GsonHttpMessageConverter gsonHttpMessageConverter(){
     GsonHttpMessageConverter messageConverter=new GsonHttpMessageConverter();
     messageConverter.setGson(new GsonBuilder().setDateFormat("yyyy-MM-dd").create());
     return messageConverter;
 }*/

  /*  @Bean
    Gson gson() {
        return new GsonBuilder().setDateFormat("yyyyMMdd").create();
    }*/

  @Bean
  FastJsonHttpMessageConverter fastJsonHttpMessageConverter(){
    FastJsonHttpMessageConverter converter=new FastJsonHttpMessageConverter();
    FastJsonConfig config=new FastJsonConfig();
    config.setDateFormat("yyyy/MM/dd");
    converter.setFastJsonConfig(config);
    return converter;
  }
}
