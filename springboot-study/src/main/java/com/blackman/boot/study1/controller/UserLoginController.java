package com.blackman.boot.study1.controller;

import com.blackman.boot.study1.exception.MyException;
import com.blackman.boot.study1.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user1/")
public class UserLoginController {

    /**
     * 自定义异常
     * @return
     * @throws MyException
     */
    @GetMapping("test1")
    public User login() throws MyException {
        throw new MyException("参数异常");
    }


}
