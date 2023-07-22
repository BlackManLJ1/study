package com.blackman.boot.study2.exceptionenum;

import com.blackman.boot.study2.service.BaseErrorInfoInterface;

/**
 * 异常处理枚举类
 */
public enum ExceptionEnum implements BaseErrorInfoInterface {


    SUCCESS("200", "成功"),
    BODY_NOT_MATCH("4000","请求的数据格式不符!"),
    SIGNATURE_NOT_MATCH("4001","请求的数字签名不匹配!"),
    NOT_FOUND("4004", "未找到该资源!"),
    INTERNAL_SERVER_ERROR("5000", "服务器内部错误!"),
    SERVER_BUSY("5003","服务器正忙，请稍后再试!");


    /**
     * 错误码
     */
    private final String resultCode;

    /**
     * 错误信息
     */
    private final String resultMsg;


    private ExceptionEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public String getResultCode() {
        return resultCode;
    }

    @Override
    public String getResultMessage() {
        return resultMsg;
    }
}
