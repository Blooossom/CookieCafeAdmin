package com.example.cookiecafeadmin.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Component
@Aspect
public class AdminAOP {

    @Pointcut(" execution(* com.example.cookiecafeadmin.controller.*.*(..))")
    public void check(){}

    @Around("check()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder
                .currentRequestAttributes()).getRequest().getSession();
        if (session.getAttribute("admin") == null) {
            return null;
        } else {
            return joinPoint.proceed();
        }
    }


}
