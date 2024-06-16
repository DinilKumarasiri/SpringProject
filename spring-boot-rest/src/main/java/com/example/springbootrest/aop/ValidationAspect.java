package com.example.springbootrest.aop;

import jakarta.websocket.OnClose;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.NOPLogger;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.example.springbootrest.service.JobService.getJob(..)) && args(postId)")
    public Object validateAnUpdate(ProceedingJoinPoint jp, int postId) throws Throwable {
        if (postId < 0){
            LOGGER.info("Post id is negative, Updating it ");
            postId = -postId;
            LOGGER.info("Post ID" + postId);


        }
        Object obj = jp.proceed(new Object[]{postId});

        return obj;
    }
}
