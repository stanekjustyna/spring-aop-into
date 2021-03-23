package pl.training.spring.aop.flight.management.aspect;

import lombok.extern.java.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Log
@Order(2)
public class LoggingAspect2 {

    @Pointcut("execution(* pl.training.spring.aop.flight.management.domain.*.*set*(..))")
    public void allSetters() {}

    @Around("allSetters()")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] methodArgs = proceedingJoinPoint.getArgs();

        log.severe("Call method " + methodName + " with arg " + methodArgs[0]);
        Object result = proceedingJoinPoint.proceed();
        log.severe("Method " + methodName + " returns " + result);
        return result;
    }
}
