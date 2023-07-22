package com.blackman.boot.study2.controller;

import com.blackman.boot.study2.exception.BizException;
import com.blackman.boot.study2.pojo.User;
import com.blackman.boot.study2.result.ResultResponse;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user2/")
public class UserController {


    @PostMapping("add")
    public boolean add(@RequestBody User user) {
        return true;
    }

    @PutMapping("/update")
    public boolean update(@RequestBody User user) {
        //这里故意造成一个空指针的异常，并且不进行处理
        String str = null;
        str.equals("111");
        return true;
    }
}
