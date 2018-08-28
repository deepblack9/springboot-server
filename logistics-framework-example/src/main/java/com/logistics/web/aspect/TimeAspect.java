package com.logistics.web.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class TimeAspect {

    @Around("execution(* com.logistics.web.controller.UserController.*(..))")
    public Object handleControllerMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("time aspect start");

        long start = new Date().getTime();
        Object[] args = proceedingJoinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("arg is " + arg);
        }

        Object object = proceedingJoinPoint.proceed();

        System.out.println("time filter 耗时：" + (new Date().getTime() - start) + " ms");

        System.out.println("time aspect end");
        return object;
    }

}
