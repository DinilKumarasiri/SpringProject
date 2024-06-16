package com.example.springbootrest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // return type , class name , method name , args
//    @Before("execution(* com.example.springbootrest.service.JobService.*(..))")
//    public void logMethodCall(){
//        LOGGER.info("Method Called");
//    }

    @Before("execution(* com.example.springbootrest.service.JobService.addJobs(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method Called " + jp.getSignature().getName());
    }

    @After("execution(* com.example.springbootrest.service.JobService.addJobs(..))")
    public void logMethodCallExecuted(JoinPoint jp){
        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }


    @AfterThrowing("execution(* com.example.springbootrest.service.JobService.addJobs(..))")
    public void logMethodCrash(JoinPoint jp){
        LOGGER.info("Method has some issue " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.springbootrest.service.JobService.addJobs(..))")
    public void logMethodExecutedSuccessfully(JoinPoint jp){
        LOGGER.info("Method Executed Successfully" + jp.getSignature().getName());
    }
}
