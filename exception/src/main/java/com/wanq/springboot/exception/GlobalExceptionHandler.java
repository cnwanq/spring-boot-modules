package com.wanq.springboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandle(HttpServletRequest request, Exception e) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("exception", e);
        modelAndView.addObject("url", request.getRequestURL());
        return modelAndView;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandle(HttpServletRequest request, Exception e) {
        ErrorInfo<String> info = new ErrorInfo<>();
        info.setMessage(e.getMessage());
        info.setCode(ErrorInfo.ERROR);
        info.setData("Some Data");
        info.setUrl(request.getRequestURL().toString());
        return info;
    }

}