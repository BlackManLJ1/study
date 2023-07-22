package com.blackman.boot.study2.service;

public interface BaseErrorInfoInterface {

    /**
     * 获取错误码
     * @return 返回错误码
     */
    String getResultCode();


    /**
     * 获取错误信息
     * @return 返回错误信息
     */
    String getResultMessage();
}
