package com.blackman.boot.study1.result;

import lombok.Data;

@Data
public class Result<T> {

    private Integer code;

    private String message;

    private T data;


    private Result() {}

    private static<T> Result build(ResultCodeEnum resultCodeEnum, T data) {
        Result result = new Result();
        if (data != null) {
            result.setData(data);
        }
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(result.getMessage());
        return  result;
    }

    public static<T> Result ok(T data) {
       return build(ResultCodeEnum.SUCCESS, data);
    }

    public static<T> Result fail(T data) {
        return build(ResultCodeEnum.FAIL, data);
    }
}
