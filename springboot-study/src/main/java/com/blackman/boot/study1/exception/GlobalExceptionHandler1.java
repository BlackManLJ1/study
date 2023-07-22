/**
package com.blackman.boot.study1.exception;

import com.blackman.boot.study1.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler1 {

    // 自定义业务异常
    @ExceptionHandler(value = MyException.class)
    public Result<String> bizExceptionHandler(MyException e) {
        log.error("发生业务异常: " ,e.getMessage());
        return Result.fail(e.getMessage());
    }

    // 处理空指针异常
    @ExceptionHandler(value = NullPointerException.class)
    public Result<String> exceptionHandler(NullPointerException e) {
        log.error("空指针异常:", e.getMessage());
        return Result.fail(e.getMessage());
    }
}
*/
