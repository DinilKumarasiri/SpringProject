package com.example.springbootrest.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;

@Component
@Aspect
public class PerformanceMonitoringAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitoringAspect.class);

    @Around("execution(* com.example.springbootrest.service.JobService.*(..))")
    public Object monitoring(ProceedingJoinPoint jp) throws Throwable{
        var start = System.currentTimeMillis();

        Object obj = jp.proceed();
        long end = System.currentTimeMillis();

        LOGGER.info("Time taken : " + jp.getSignature().getName() + " : " + (end-start) + " ms");
        return obj ;
    }
}
