package com.blackman.boot.stu1.result;


import lombok.Data;
import lombok.Setter;

import java.util.Objects;

@Data
public class R<T> {

    private Integer code;

    private String msg;

    private T data;

    private static <T> R builder(ResultEnum result, T data) {
        R r = new R();
        if (Objects.nonNull(data)) {
           r.setCode(result.getCode());
           r.setMsg(result.getMsg());
           r.setData(data);
        }
        r.setCode(result.getCode());
        r.setMsg(result.getMsg());
        return r;
    }

    public static <T> R ok(T data) {
        return builder(ResultEnum.SUCCESS, data);
    }

    public static <T> R error(T data) {
        return builder(ResultEnum.FAIL, data);
    }
}
