package com.blackman.boot.stu2.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * 自定义校验注解器
 */
public class ListValueConstraintValidator implements ConstraintValidator<ListValue, Integer> {

    private Set<Integer> set = new HashSet<>();

    // 初始化方法
    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] values = constraintAnnotation.values();
        for (int value : values) {
            set.add(value);
        }
    }

    // 判断是否校验成功
    // 需要校验的值
    @Override
    public boolean isValid(Integer val, ConstraintValidatorContext constraintValidatorContext) {
        return set.contains(val);
    }
}
