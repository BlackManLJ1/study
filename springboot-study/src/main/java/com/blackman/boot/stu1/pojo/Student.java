package com.blackman.boot.stu1.pojo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Student {

    private Integer code;

    @NotBlank
    private String name;

    private String address;
}
