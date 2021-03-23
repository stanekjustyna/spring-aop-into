package pl.training.spring.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Log
public class LoggingAspect {

    @Around("@annotation(pl.training.spring.aop.Logging)")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] methodArg = proceedingJoinPoint.getArgs();
        log.info("Call method: " + methodName + " with argument: " + methodArg);
        Object result = proceedingJoinPoint.proceed();
        log.info("Method: " + methodName + " returns " + result);
        return result;
    }

}
