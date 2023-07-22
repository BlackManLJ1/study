package com.blackman.boot.study2.handler;

import com.blackman.boot.study2.exception.BizException;
import com.blackman.boot.study2.exceptionenum.ExceptionEnum;
import com.blackman.boot.study2.result.ResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义异常处理
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler2 {

    /**
     * 处理自定义的业务异常
     * @param req
     * @param biz
     * @return
     */
    @ExceptionHandler(BizException.class)
    @ResponseBody
    public ResultResponse bizExceptionHandler(HttpServletRequest req, BizException biz) {
        log.error("发生业务异常！原因是：{}",biz.getErrorMsg());
        return ResultResponse.error(biz.getErrorCode(), biz.getErrorMsg());
    }

    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ResultResponse exceptionHandler(HttpServletRequest req, NullPointerException e) {
        log.error("发生空指针异常；", e.getMessage());
        return ResultResponse.error(ExceptionEnum.BODY_NOT_MATCH);
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultResponse exceptionHandler(HttpServletRequest req, Exception e) {
        log.error("未知异常:", e.getMessage());
        return ResultResponse.error(ExceptionEnum.INTERNAL_SERVER_ERROR);
    }


}
