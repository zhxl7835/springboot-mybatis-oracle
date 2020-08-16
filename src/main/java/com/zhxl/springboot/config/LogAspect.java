package com.zhxl.springboot.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect {
    @Pointcut("execution(public * com.zhxl.springboot.controller.HelloController.*(..))")
    public void LogAspect(){}




}