package com.blackman.boot.stu1.ex;

import com.blackman.boot.stu1.result.R;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice(basePackages = "com.blackman.boot.controller")
public class StudentExceptionHandler {


    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R argumentValidException(MethodArgumentNotValidException e) {
        Map<String, String> map = new HashMap<>();
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getFieldErrors().forEach(fieldError -> {
            String field = fieldError.getField();
            String message = fieldError.getDefaultMessage();
            map.put(field, message);
        });
        return R.error(map);
    }
}
