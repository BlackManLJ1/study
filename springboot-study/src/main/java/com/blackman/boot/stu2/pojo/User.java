package com.blackman.boot.stu2.pojo;

import com.blackman.boot.stu2.validator.ListValue;
import com.blackman.boot.stu2.validator.group.AddGroup;
import com.blackman.boot.stu2.validator.group.UpdateGroup;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
public class User {

    @Null(message = "添加用户信息ID必须为空", groups = AddGroup.class)
    @NotNull(message = "修改用户信息ID不能为空", groups = UpdateGroup.class)
    private Integer id;

    private String name;

    private Integer age;

    @ListValue(values = {0,1}, groups = AddGroup.class)
    private Integer sex;
}
