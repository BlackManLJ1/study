package com.blackman.boot.stu2.ex;

import com.blackman.boot.stu1.result.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice(basePackages = "com.blackman.boot.stu2.controller")
public class UserExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R methodArgumentValidException(MethodArgumentNotValidException e) {
        Map<String, String> map = new HashMap<>();
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getFieldErrors().forEach(fieldError -> {
            String field = fieldError.getField();
            String message = fieldError.getDefaultMessage();
            map.put(field, message);
        });
        log.error("参数校验异常{}", e.getMessage());
        return R.error(map);
    }

    @ExceptionHandler(Throwable.class)
    public R throwableException(Throwable e) {
        log.error("发生了异常,异常为:" + e.getMessage());
        return R.error(e.getMessage());
    }
}
