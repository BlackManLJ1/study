package com.blackman.boot.stu2.controller;

import com.blackman.boot.stu2.pojo.User;
import com.blackman.boot.stu2.validator.group.AddGroup;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/stu2")
@RestController
public class UserController {

    @RequestMapping("/save")
    public String save(@Validated(AddGroup.class) @RequestBody User user) {
        return "success";
    }
}
