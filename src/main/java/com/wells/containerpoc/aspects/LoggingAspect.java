package com.wells.containerpoc.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.mapping.Join;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class LoggingAspect {
/* 
       @Before("execution(* com.wells.containerpoc.controller.*.*(..)) || " +
            "execution(* com.wells.containerpoc.repo.*.*(..)) || " +
            "execution(* com.wells.containerpoc.service.*.*(..))")
    public void logMethodCallStart(JoinPoint joinPoint) {
        log.info("Execution started: {}.{}()", 
            joinPoint.getSignature().getDeclaringTypeName(),
            joinPoint.getSignature().getName());
    } */

/* 
     @After("execution(* com.wells.containerpoc.controller.*.*(..)) || " +
            "execution(* com.wells.containerpoc.repo.*.*(..)) || " +
            "execution(* com.wells.containerpoc.service.*.*(..))")
    public void logMethodCallEnd(JoinPoint joinPoint) {
        log.info("Execution completed: {}.{}()", 
            joinPoint.getSignature().getDeclaringTypeName(),
            joinPoint.getSignature().getName());
    }
 */
      @Around("execution(* com.wells.containerpoc.controller.*.*(..)) || " +
          //  "execution(* com.wells.containerpoc.repo.*.*(..)) || " +
            "execution(* com.wells.containerpoc.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        
      
        
        Object result = joinPoint.proceed();
        
        long executionTime = System.currentTimeMillis() - startTime;
        log.info("Printing execution time : {}.{}() - Execution time: {} ms", 
            joinPoint.getSignature().getDeclaringTypeName(),
            joinPoint.getSignature().getName(),
            executionTime);
        
        return result;
    }



}
