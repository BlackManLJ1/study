package com.blackman.boot.study2.exception;

import com.blackman.boot.study2.service.BaseErrorInfoInterface;


/**
 * 自定义异常
 */
public class BizException extends RuntimeException {

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String errorMsg;

    public BizException() {
        super();
    }

    public BizException(BaseErrorInfoInterface baseErrorInfoInterface) {
        super(baseErrorInfoInterface.getResultCode());
        this.errorCode = baseErrorInfoInterface.getResultCode();
        this.errorMsg = baseErrorInfoInterface.getResultMessage();
    }

    public BizException(BaseErrorInfoInterface baseErrorInfoInterface, Throwable throwable) {
        super(baseErrorInfoInterface.getResultCode(), throwable);
        this.errorCode = baseErrorInfoInterface.getResultCode();
        this.errorMsg = baseErrorInfoInterface.getResultMessage();
    }

    public BizException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public BizException(String errorCode, String errorMsg) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BizException(String errorCode, String errorMsg, Throwable cause) {
        super(errorCode, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
