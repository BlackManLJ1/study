package com.blackman.boot.study2.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 自定义异常处理
 */
/*
@Slf4j
@ControllerAdvice
public class MyExceptionHandler {


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String exceptionHandler(Exception e) {
        log.error(e.getMessage());
        return "全局异常捕获，错误原因：" + e.getMessage();
    }
}*/
