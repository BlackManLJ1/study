package com.blackman.boot.stu1.controller;

import com.blackman.boot.stu1.pojo.Student;
import com.blackman.boot.stu1.result.R;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/stu1")
@RestController
public class StudentController {

    @RequestMapping("/save")
    public R save(@Validated @RequestBody Student student) {
        return R.error(null);
    }
}
