package org.teasir.upload.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
* 1定制异常信息
* */

 @ControllerAdvice
public class MyUploadException {
 /*
 //直接输出错误
 @ExceptionHandler(MaxUploadSizeExceededException.class)
    public void excepHandler(MaxUploadSizeExceededException e, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
       PrintWriter out= response.getWriter();
       out.write("上传文件超过限制O");
       out.flush();
       out.close();
    }*/
//整合thymeleaf在页面输出错误
     @ExceptionHandler(MaxUploadSizeExceededException.class)
     public ModelAndView excepHandler(MaxUploadSizeExceededException e) throws IOException {
      ModelAndView modelAndView=new ModelAndView("myError");
      modelAndView.addObject("error","上传文件超过限制M");
      return modelAndView;
     }
}
